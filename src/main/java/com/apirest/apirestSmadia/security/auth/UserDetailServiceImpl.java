package com.apirest.apirestSmadia.security.auth;


import com.apirest.apirestSmadia.security.jwt.JwtUtils;
import com.apirest.apirestSmadia.user.domain.models.authdto.AuthLoginRequest;
import com.apirest.apirestSmadia.user.domain.models.authdto.AuthResponse;
import com.apirest.apirestSmadia.user.infrastructure.entity.RolePermission;
import com.apirest.apirestSmadia.user.infrastructure.entity.UserRole;
import com.apirest.apirestSmadia.user.infrastructure.entity.UserTable;
import com.apirest.apirestSmadia.user.infrastructure.repositories.IrolePermissionRepository;
import com.apirest.apirestSmadia.user.infrastructure.repositories.IuserRoleRepository;
import com.apirest.apirestSmadia.user.infrastructure.repositories.IuserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    IuserTableRepository userRepository;
    @Autowired
    IuserRoleRepository userRoleRepository;
    @Autowired
    IrolePermissionRepository irolePermission;
    @Override
    public UserDetails loadUserByUsername(String username) {
        UserTable userEntity = userRepository.findByNameUser(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + " no existe."));
        List<RolePermission> rolePermissionList=null;
        List<UserRole> userRoleList =null;
        UserRole userRole =null;
        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();
        List<SimpleGrantedAuthority> userRoleAuthorities = new ArrayList<>();
        if(userEntity!=null){
            userRole = userRoleRepository.findByUserTable(userEntity);
            userRoleList = userRoleRepository.findAllByUserTable(userEntity);
        }
        if(userRole!=null){
            rolePermissionList = irolePermission.findAllByRole(userRole.getRole());
        }
        if (userRoleList != null) {
            userRoleAuthorities = userRoleList.stream()
                    .flatMap(role -> Stream.of(role.getRole().getRoleName()))
                    .map(roleName -> new SimpleGrantedAuthority("ROLE_" +roleName))
                    .collect(Collectors.toList());
        }
        List<SimpleGrantedAuthority> rolePermissionAuthorities = null;
        rolePermissionAuthorities = rolePermissionList.stream()
                .flatMap(rolePermission -> Stream.of(rolePermission.getPermission().getName()))
                .map(permissionName -> new SimpleGrantedAuthority(permissionName))
                .collect(Collectors.toList());
// Unir ambas listas en una sola
        authorityList.addAll(userRoleAuthorities);
        authorityList.addAll(rolePermissionAuthorities);
        return new User(userEntity.getNameUser(), userEntity.getPassword(), userEntity.isEnabled(), userEntity.isAccountNoExpired(), userEntity.isCredentialNoExpired(), userEntity.isAccountNoLocked(), authorityList);
    }

    public AuthResponse loginUser(AuthLoginRequest authLoginRequest) {
        String username = authLoginRequest.username();
        String password = authLoginRequest.password();
        Authentication authentication = this.authenticate(username, password);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String accessToken = jwtUtils.createToken(authentication);
        AuthResponse authResponse = new AuthResponse(username, "User loged succesfully", accessToken, true);
        return authResponse;
    }

    public Authentication authenticate(String username, String password) {
        UserDetails userDetails = this.loadUserByUsername(username);
        if (userDetails == null) {
            throw new BadCredentialsException(String.format("Invalid username or password"));
        }
        if (!passwordEncoder.matches(password, userDetails.getPassword())) {
            throw new BadCredentialsException("Incorrect Password");
        }
        return new UsernamePasswordAuthenticationToken(username, password, userDetails.getAuthorities());
       }
}
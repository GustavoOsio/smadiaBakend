package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.Role;
import com.apirest.apirestSmadia.user.infrastructure.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IrolePermissionRepository extends JpaRepository<RolePermission, Long> {

    Optional<RolePermission> findByRole(Role role);

    List<RolePermission> findAllByRole(Role role);
}

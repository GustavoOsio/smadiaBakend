package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.UserRole;
import com.apirest.apirestSmadia.user.infrastructure.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IuserRoleRepository extends JpaRepository<UserRole, Long> {
  //  Optional<UserRole> findByUserTable(UserTable userEntity);

    UserRole findByUserTable(UserTable userEntity);

    List<UserRole> findAllByUserTable(UserTable userEntity);
}

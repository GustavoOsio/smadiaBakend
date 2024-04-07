package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.UserTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IuserTableRepository extends CrudRepository<UserTable,Long> {
    Optional<UserTable> findByNameUser(String username);
}

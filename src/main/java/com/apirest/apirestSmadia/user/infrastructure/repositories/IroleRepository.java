package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IroleRepository extends CrudRepository<Role,Long> {
}

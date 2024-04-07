package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IpermissionRepository extends CrudRepository<Permission, Long> {
}

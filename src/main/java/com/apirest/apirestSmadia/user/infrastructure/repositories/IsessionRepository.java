package com.apirest.apirestSmadia.user.infrastructure.repositories;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsessionRepository extends JpaRepository<Session, Long> {
}

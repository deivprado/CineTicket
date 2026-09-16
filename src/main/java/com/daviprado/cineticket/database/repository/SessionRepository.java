package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}

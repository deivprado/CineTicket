package com.daviprado.cineticket.database.repository;

import com.daviprado.cineticket.database.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}

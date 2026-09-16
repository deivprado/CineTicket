package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Room;
import com.daviprado.cineticket.database.repository.RoomRepository;
import com.daviprado.cineticket.dto.RoomDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RoomService {

    private final RoomRepository roomRepository;

    public List<Room> findAllRoom() {
        return roomRepository.findAll();
    }

    public Optional<Room> findRoomById(Long id) {
        return roomRepository.findById(id);
    }

    public void createRoom(RoomDto roomDto) {
        roomRepository.save(Room.builder()
                .number(roomDto.getNumber())
                .totalSeats(roomDto.getTotalSeats())
                .build());
    }

}

package com.daviprado.cineticket.controller;

import com.daviprado.cineticket.database.entity.Room;
import com.daviprado.cineticket.dto.RoomDto;
import com.daviprado.cineticket.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Room> findAllRoom(RoomDto roomDto) {
        return roomService.findAllRoom();
    }

    @GetMapping("/id")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Room> findRoomById(@PathVariable("id") Long id) {
        return roomService.findRoomById(id);
    }

}

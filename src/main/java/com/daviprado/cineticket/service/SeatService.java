package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Room;
import com.daviprado.cineticket.database.entity.Seat;
import com.daviprado.cineticket.database.repository.RoomRepository;
import com.daviprado.cineticket.database.repository.SeatRepository;
import com.daviprado.cineticket.dto.SeatDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;
    private final RoomRepository roomRepository;

    public List<Seat> findAllSeat() {
        return seatRepository.findAll();
    }

    public Optional<Seat> findSeatById(Long id) {
        return seatRepository.findById(id);
    }

    public void createSeat(SeatDto seatDto) {
        Room room = roomRepository.getReferenceById(seatDto.getRoomId());

        seatRepository.save(Seat.builder()
                .row(seatDto.getRow())
                .number(seatDto.getNumber())
                .romm(room)
                .build());
    }
}

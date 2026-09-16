package com.daviprado.cineticket.service;

import com.daviprado.cineticket.database.entity.Movie;
import com.daviprado.cineticket.database.entity.Room;
import com.daviprado.cineticket.database.entity.Session;
import com.daviprado.cineticket.database.repository.MovieRepository;
import com.daviprado.cineticket.database.repository.RoomRepository;
import com.daviprado.cineticket.database.repository.SessionRepository;
import com.daviprado.cineticket.dto.SessionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;
    private final MovieRepository movieRepository;
    private final RoomRepository roomRepository;

    public List<Session> findAllSession() {
        return sessionRepository.findAll();
    }

    public Optional<Session> findSessionById(Long id) {
        return sessionRepository.findById(id);
    }

    public void createSession(SessionDto sessionDto) {
        Movie movie = movieRepository.getReferenceById(sessionDto.getRoomId());
        Room room = roomRepository.getReferenceById(sessionDto.getRoomId());

        sessionRepository.save(Session.builder()
                .startTime(sessionDto.getStartTime())
                .audioType(sessionDto.getAudioType())
                .exhibitionType(sessionDto.getExhibitionType())
                .ticketPrice(sessionDto.getTicketPrice())
                .movie(movie)
                .room(room)
                .build());
    }
}

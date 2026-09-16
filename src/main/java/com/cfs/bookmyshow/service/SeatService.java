package com.cfs.bookmyshow.service;

import com.cfs.bookmyshow.dto.SeatRequest;
import com.cfs.bookmyshow.dto.ShowRequest;
import com.cfs.bookmyshow.entity.*;
import com.cfs.bookmyshow.repository.SeatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class SeatService {

    private  final SeatRepository seatRepository;
    private  final ScreenService screenService;
    private final TheaterService theaterService;



     //add seat
/*
    public Seat addSeat(SeatRequest request){
        Screen screen = screenService.getScreenById(request.getScreenId());

        Seat seat = Seat.builder()
                .seatNumber(request.getSeatNumber())
                .row(request.getRow())
                .col(request.getCol())
                .seatType(request.getSeatType())
                .screen(screen)
                .build();

        return seatRepository.save(seat);
    }*/
    public List<Seat> getSeatByScreen(Long screenId){
        return seatRepository.findByScreenId(screenId);
    }

    public Seat getSeatById(Long id){
        return seatRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("seat not found "+id));
    }



}

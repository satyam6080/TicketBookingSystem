package com.cfs.bookmyshow.controller;

import com.cfs.bookmyshow.entity.Seat;
import com.cfs.bookmyshow.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seats")

public class SeatController {

    private final SeatService seatService;

    @GetMapping("/screen/{screenId}")
    public ResponseEntity<List<Seat>> getSeatByScreen(@PathVariable Long screenId){
         return ResponseEntity.ok(seatService.getSeatByScreen(screenId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Seat> getSeatById(@PathVariable Long id){
        return ResponseEntity.ok(seatService.getSeatById(id));
    }

}

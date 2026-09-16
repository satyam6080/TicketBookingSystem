package com.cfs.bookmyshow.controller;

import com.cfs.bookmyshow.entity.Theater;
import com.cfs.bookmyshow.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/theaters")

public class TheaterController {

    private final TheaterService theaterService;

    @GetMapping
    public ResponseEntity<List<Theater>> getAllTheater(){
        return ResponseEntity.ok(theaterService.getAllTheater());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Theater> getTheaterById(@PathVariable Long id){
        return ResponseEntity.ok(theaterService.getTheaterById(id));
    }

    @GetMapping("/city/{cityId}")
    public ResponseEntity<List<Theater>> getTheaterByCityId(@PathVariable Long cityId){
        return ResponseEntity.ok(theaterService.getTheaterByCity(cityId));
    }
}

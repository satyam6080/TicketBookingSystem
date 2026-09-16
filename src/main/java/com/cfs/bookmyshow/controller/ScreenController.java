package com.cfs.bookmyshow.controller;

import com.cfs.bookmyshow.entity.Screen;
import com.cfs.bookmyshow.entity.Seat;
import com.cfs.bookmyshow.service.ScreenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/screens")

public class ScreenController {

    private final ScreenService screenService;

    @GetMapping("/{id}")
    public ResponseEntity<Screen> getScreenById(@PathVariable Long id){
        return ResponseEntity.ok(screenService.getScreenById(id));
    }

    @GetMapping
    public ResponseEntity<List<Screen>> getAllScreen(){
        return ResponseEntity.ok(screenService.getAllScreen());
    }

    @GetMapping("/theater/{theaterId}")
    public ResponseEntity<List<Screen>> getScreenByTheater(@PathVariable Long theaterId){
        return ResponseEntity.ok(screenService.getScreenByTheater(theaterId));
    }
}

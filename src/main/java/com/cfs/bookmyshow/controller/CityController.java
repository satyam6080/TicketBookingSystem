package com.cfs.bookmyshow.controller;

import com.cfs.bookmyshow.entity.City;
import com.cfs.bookmyshow.service.CityService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cities")

public class CityController {

    private final CityService cityService;

    @GetMapping
    public ResponseEntity<List<City>> getAllCity(){
        return ResponseEntity.ok(cityService.getAllCities());
    }

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable Long id){
        return ResponseEntity.ok(cityService.getCityById(id));
    }
}

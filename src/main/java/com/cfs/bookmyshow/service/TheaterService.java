package com.cfs.bookmyshow.service;

import com.cfs.bookmyshow.dto.TheaterRequest;
import com.cfs.bookmyshow.entity.City;
import com.cfs.bookmyshow.entity.Theater;
import com.cfs.bookmyshow.repository.CityRepository;
import com.cfs.bookmyshow.repository.TheaterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TheaterService {

    private final TheaterRepository theaterRepository;
    private final CityService cityService;

    private Theater addTheater(TheaterRequest request){
        City city = cityService.getCityById(request.getCityid());
        Theater theater = Theater.builder()
                .name(request.getName())
                .address(request.getAddress())
                .city(city)
                .build();

        return theaterRepository.save(theater);
    }

    public List<Theater> getAllTheater(){
        return theaterRepository.findAll();
    }

    public Theater getTheaterById(Long id){
        return theaterRepository.findById(id)
                .orElseThrow(()->new RuntimeException("theater not found "+id));
    }

    public List<Theater> getTheaterByCity(Long cityId){
        return theaterRepository.findByCityId(cityId);
    }

}

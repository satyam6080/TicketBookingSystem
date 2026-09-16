package com.cfs.bookmyshow.service;

import com.cfs.bookmyshow.entity.Screen;
import com.cfs.bookmyshow.repository.ScreenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ScreenService {

    private final ScreenRepository screenRepository;
    private  final TheaterService theaterService;

    public List<Screen> getAllScreen(){
        return screenRepository.findAll();
    }

    public Screen getScreenById(Long id){
        return screenRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Screen not found "+id));
    }

    public List<Screen> getScreenByTheater(Long theaterId){
        return screenRepository.findByTheaterId(theaterId);
    }
}

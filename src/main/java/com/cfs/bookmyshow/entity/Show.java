package com.cfs.bookmyshow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "shows")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="movie_id", nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="screen_id", nullable = false)
    private Screen screen;

    @Column(nullable = false)
    private LocalDate showDate;

    @Column(nullable = false)
    private LocalDateTime startTime;

    private LocalDateTime endTime;
    private  Double ticketPrice;


}

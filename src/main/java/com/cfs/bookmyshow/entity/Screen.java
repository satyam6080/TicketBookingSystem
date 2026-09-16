package com.cfs.bookmyshow.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "screens")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Screen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private Integer totalSeat;

    @ManyToOne
    @JoinColumn(name = "theater_id",nullable = false)
    private Theater theater;


}

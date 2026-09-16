package com.cfs.bookmyshow.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    private String phone;

    @Column(nullable = false,unique = true)
    private String email;

    private LocalDateTime createdAt;

    @PrePersist
    protected  void onCreate(){
        this.createdAt = LocalDateTime.now();
    }
}

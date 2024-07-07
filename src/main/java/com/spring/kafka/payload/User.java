package com.spring.kafka.payload;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {
    private int id;
    private String firstName;
    private String lastName;
}

package ru.mirea.gradebook.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Table
@Entity
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Subject(String name, Integer hours) {
        this.name = name;
        this.hours = hours;
    }

    private String name;
    private Integer term;
    private Integer hours;
}

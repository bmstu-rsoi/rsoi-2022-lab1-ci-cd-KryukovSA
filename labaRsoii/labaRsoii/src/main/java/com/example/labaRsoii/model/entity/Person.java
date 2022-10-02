package com.example.labaRsoii.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "person")
public class Person {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String work;

    @Column
    private int age;
}
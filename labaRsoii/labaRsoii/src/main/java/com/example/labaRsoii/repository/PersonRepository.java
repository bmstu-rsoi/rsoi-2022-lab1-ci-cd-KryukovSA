package com.example.labaRsoii.repository;

import com.example.labaRsoii.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person getById(int id);
    List<Person> findAll();
    Object savePerson (Person person);
    void deletePersonById(int id);
    Person updatePersonById(int id, Person person);
}

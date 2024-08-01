package com.cwa.crud_springboot.controller;

import com.cwa.crud_springboot.model.Person;
import com.cwa.crud_springboot.repo.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping( "/api/persons")
public class PersonController {

    private PersonRepository personRepository;

    @GetMapping
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person personCreated = personRepository.save(person);
        return new ResponseEntity<>(personCreated, HttpStatus.CREATED);
    }
}

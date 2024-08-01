package com.cwa.crud_springboot.repo;

import com.cwa.crud_springboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

package com.example.demo.site;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Id>{

}

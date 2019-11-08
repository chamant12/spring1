package com.example.demo.site;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sun.xml.bind.v2.model.core.ID;

@Service
public class CarService{
	private CarRepositoryImpl carRepositoryImpl = new CarRepositoryImpl();

	public void addCar(String carName) {
		Car newCar = new Car();
		newCar.setCarName(carName);
		this.carRepositoryImpl.save(newCar);
	}

	public Car getCars(){
		Car cars = (Car) this.carRepositoryImpl.findAll();
		return cars;
	}
	
}

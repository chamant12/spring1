package com.example.demo.site;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CarService implements CarRepository{
	private CarRepository carRepository;
	
	public void addCar(String carName) {
		Car newCar = new Car();
		newCar.setCarName(carName);
		this.carRepository.save(newCar);
	}

	@Override
	public Object save(Object entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable saveAll(Iterable entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional findById(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Object id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable findAllById(Iterable ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}

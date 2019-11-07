package com.example.demo.site;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.stereotype.Service;

@Service
public class CarService implements CarRepository{
	private CarRepository carRepository;

	@Override
	public <S extends Car> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Car> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Car> findById(Id id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Id id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Car> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Car> findAllById(Iterable<Id> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Id id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Car entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Car> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	public void addCar(String carName) {
		Car newCar = new Car();
		newCar.setCarName(carName);
		this.carRepository.save(newCar);
	}

}

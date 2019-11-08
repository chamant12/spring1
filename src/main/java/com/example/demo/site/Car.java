package com.example.demo.site;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private long id;
	private String carName;
	
	public Car() {
		
	}
	
	public Car(long id,String carName) {
		this.id = id;
		this.carName = carName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
}

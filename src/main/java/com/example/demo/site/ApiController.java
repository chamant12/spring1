package com.example.demo.site;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	private CarService carService;
	
	@CrossOrigin
	@RequestMapping("/rest")
	public List<String> getData() {
		List<String> cars = new ArrayList<String>(Arrays.asList("Volvo", "BMW", "Ford", "Mazda"));
		return cars;
	}
	
	@CrossOrigin
	@RequestMapping("/rest/add/{carName}")
	public void addData(@RequestParam String carName) {
		this.carService.addCar(carName);
	}
}

package com.example.demo.site;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	private CarService carService = new CarService();

	@CrossOrigin
	@RequestMapping("/cars")
	public Car getCars(){
		return this.carService.getCars();
	}
	
	@CrossOrigin
	@RequestMapping("/addCar")
	public String addData(@RequestParam String carName) {
		try{
			this.carService.addCar(carName);
		} catch(Exception e){
			return String.valueOf(e);
		}

		return "success";
	}
}

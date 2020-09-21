package com.avenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.avenger.model.Avenger;
import com.avenger.service.AvengerService;

public class AvengerSearchController {
	
	@Autowired
	private AvengerService service;

	
	@GetMapping("/avengers/{age}")
	public List<Avenger> getAllAvengersByAge(@PathVariable int age) {
		// TODO Auto-generated method stub
		return service.getAllAvengersByAge(age);
	}

	@GetMapping("/avengers/{name}")
	public List<Avenger> getAllAvengersByName(@PathVariable String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Avenger> getAllAvengersBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/avengers")
	public List<Avenger> getAllAvengers() {
		// TODO Auto-generated method stub
		return service.getAllAvengers();
	}

}

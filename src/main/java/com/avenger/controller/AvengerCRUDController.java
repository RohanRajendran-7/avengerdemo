package com.avenger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avenger.model.Avenger;
import com.avenger.service.AvengerService;

@RestController
public class AvengerCRUDController {
	
	@Autowired
	private AvengerService service;

	@PostMapping("/avenger")
	public Avenger addAvenger(@RequestBody Avenger avenger) {
		// TODO Auto-generated method stub
		return service.addAvenger(avenger);
	}

	
	@PutMapping
	public Avenger updateAvenger(@RequestBody Avenger avenger) {
		// TODO Auto-generated method stub
		return service.updateAvenger(avenger);
	}

	@GetMapping("/avenger/{id}")
	public Avenger getAvengerById(@PathVariable("id") int id) {
		// TODO Auto-generated method stub
		return service.getAvengerById(id);
	}

	@DeleteMapping("/avenger/{id}")
	public void deleteAvengerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteAvengerById(id);
		}
}

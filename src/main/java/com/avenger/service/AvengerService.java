package com.avenger.service;

import java.util.List;

import com.avenger.model.Avenger;

public interface AvengerService {

	public Avenger addAvenger(Avenger avenger);
	public Avenger updateAvenger(Avenger avenger);
	public Avenger getAvengerById(int id);
	public void deleteAvengerById(int id);
	public List<Avenger> getAllAvengers();
	public List<Avenger> getAllAvengersByAge(int age);
	public List<Avenger> getAllAvengersByName(String name);
	public List<Avenger> getAllAvengersBySpeciality(String speciality);
}

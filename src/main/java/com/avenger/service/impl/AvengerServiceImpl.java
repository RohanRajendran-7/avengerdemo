package com.avenger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avenger.dao.AvengerRepository;
import com.avenger.model.Avenger;
import com.avenger.service.AvengerService;

@Service
public class AvengerServiceImpl implements AvengerService {
	
	@Autowired
	private AvengerRepository dao;

	@Override
	public Avenger addAvenger(Avenger avenger) {
		// TODO Auto-generated method stub
		return dao.save(avenger);
	}

	@Override
	public Avenger updateAvenger(Avenger avenger) {
		// TODO Auto-generated method stub
		return dao.save(avenger);
	}

	@Override
	public Avenger getAvengerById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void deleteAvengerById(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public List<Avenger> getAllAvengersByAge(int age) {
		// TODO Auto-generated method stub
		return dao.findByAge(age);
	}

	@Override
	public List<Avenger> getAllAvengersByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public List<Avenger> getAllAvengersBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return dao.findBySpeciality(speciality);
	}

	@Override
	public List<Avenger> getAllAvengers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}

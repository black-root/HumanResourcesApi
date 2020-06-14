package com.ues.occ.proyeccion.social.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ues.occ.proyeccion.social.app.entities.Regions;
import com.ues.occ.proyeccion.social.app.repository.RegionsRepository;

@Service
public class RegionsService{

	@Autowired
	RegionsRepository repo;

	public Iterable<Regions> findAllRegions() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
}

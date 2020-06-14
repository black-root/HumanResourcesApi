package com.ues.occ.proyeccion.social.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ues.occ.proyeccion.social.app.entities.Regions;
import com.ues.occ.proyeccion.social.app.services.RegionsService;

@RestController
@RequestMapping(value = "/api/hr/regions")
public class RegionsController {
	
	@Autowired
	RegionsService service;
	
	@GetMapping(value = "/all")
	public Iterable<Regions> findAllRegions() {
		return service.findAllRegions();
	}

}

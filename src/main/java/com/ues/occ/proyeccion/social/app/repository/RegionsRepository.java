package com.ues.occ.proyeccion.social.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ues.occ.proyeccion.social.app.entities.Regions;

@Repository
public interface RegionsRepository extends CrudRepository<Regions, Integer> {

}

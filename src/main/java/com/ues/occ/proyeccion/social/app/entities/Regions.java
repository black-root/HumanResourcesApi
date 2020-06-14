package com.ues.occ.proyeccion.social.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Regions implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "region_id")
	private Integer regionId;
	
	@Column(name = "region_name")
	private String regionName;

	public Regions() {}
	
	public Regions(Integer regionId, String regionName) {
		super();
		this.regionId = regionId;
		this.regionName = regionName;
	}

	public Integer getRegionId() {
		return regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	@Override
	public String toString() {
		return "Regions [regionId=" + regionId + ", regionName=" + regionName + "]";
	}
	
}

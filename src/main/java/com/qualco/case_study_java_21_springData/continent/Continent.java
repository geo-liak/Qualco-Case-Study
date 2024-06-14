package com.qualco.case_study_java_21_springData.continent;


import jakarta.persistence.*;


@Entity
@Table(name = "continents")
public class Continent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long continentId;
	private String name;
	
	public Continent() {
	}
	
	public Continent(Long continentId, String name) {
		this.continentId = continentId;
		this.name = name;
	}
	
	public Long getContinentId() {
		return continentId;
	}
	
	public void setContinentId(Long continentId) {
		this.continentId = continentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

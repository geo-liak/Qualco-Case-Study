package com.qualco.casestudy.countryinfo;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class CountryInfoDTO {
	
	@EmbeddedId
	private CountryInfoId id;
	@Column(insertable=false, updatable=false)
	private String continent;
	@Column(insertable=false, updatable=false)
	private String region;
	@Column(insertable=false, updatable=false)
	private String country;
	private Long year;
	private Long population;
	private Long gdp;
	
	public CountryInfoDTO() {
	}
	
	public CountryInfoDTO(CountryInfoId id, String continent, String region, String country, Long year, Long population, Long gdp) {
		this.id = id;
		this.continent = continent;
		this.region = region;
		this.country = country;
		this.year = year;
		this.population = population;
		this.gdp = gdp;
	}
	
	public String getContinent() {
		return continent;
	}
	
	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String getRegion() {
		return region;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Long getYear() {
		return year;
	}
	
	public void setYear(Long year) {
		this.year = year;
	}
	
	public Long getPopulation() {
		return population;
	}
	
	public void setPopulation(Long population) {
		this.population = population;
	}
	
	public Long getGdp() {
		return gdp;
	}
	
	public void setGdp(Long gdp) {
		this.gdp = gdp;
	}
}

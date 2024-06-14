package com.qualco.casestudy.country;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Country {
	
	@Id
	private Long countryId;
	private String name;
	private Double area;
	@Column(name = "country_code2")
	private String countryCode;
	
	public Country() {
	}
	
	public Country(Long countryId, String name, Double area, String countryCode) {
		this.countryId = countryId;
		this.name = name;
		this.area = area;
		this.countryCode = countryCode;
	}
	
	public Long getCountryId() {
		return countryId;
	}
	
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getArea() {
		return area;
	}
	
	public void setArea(Double area) {
		this.area = area;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}

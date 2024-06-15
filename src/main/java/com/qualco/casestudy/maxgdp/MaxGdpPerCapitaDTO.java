package com.qualco.casestudy.maxgdp;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import org.apache.catalina.valves.rewrite.RewriteCond;

@Entity
public class MaxGdpPerCapitaDTO {

	@EmbeddedId
	private MaxGdpPerCapitaId id;
	private String country;
	private String code;
	@Column(insertable=false, updatable=false)
	private Integer year;
	@Column(insertable=false, updatable=false)
	private Long population;
	@Column(insertable=false, updatable=false)
	private Long gdp;
	
	public MaxGdpPerCapitaDTO() {
	
	}
	
	public MaxGdpPerCapitaDTO(MaxGdpPerCapitaId id, String country, String code, Integer year, Long population, Long gdp) {
		this.id = id;
		this.country = country;
		this.code = code;
		this.year = year;
		this.population = population;
		this.gdp = gdp;
	}
	
	public MaxGdpPerCapitaId getId() {
		return id;
	}
	
	public void setId(MaxGdpPerCapitaId id) {
		this.id = id;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public Integer getYear() {
		return year;
	}
	
	public void setYear(Integer year) {
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
	

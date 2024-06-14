package com.qualco.casestudy.countryinfo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryInfoId implements Serializable {
	private Long year;
	private Long population;
	private Long gdp;
	
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CountryInfoId)) return false;
		CountryInfoId that = (CountryInfoId) o;
		return getYear().equals(that.getYear()) && getPopulation().equals(that.getPopulation()) && getGdp().equals(that.getGdp());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getYear(), getPopulation(), getGdp());
	}
}

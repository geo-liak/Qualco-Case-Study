package com.qualco.casestudy.countryinfo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryInfoId implements Serializable {
	private long year;
	private long population;
	private long gdp;
	
	public long getYear() {
		return year;
	}
	
	public void setYear(long year) {
		this.year = year;
	}
	
	public long getPopulation() {
		return population;
	}
	
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public long getGdp() {
		return gdp;
	}
	
	public void setGdp(long gdp) {
		this.gdp = gdp;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CountryInfoId)) return false;
		CountryInfoId that = (CountryInfoId) o;
		return getYear() == that.getYear() && getPopulation() == that.getPopulation() && getGdp() == that.getGdp();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getYear(), getPopulation(), getGdp());
	}
}


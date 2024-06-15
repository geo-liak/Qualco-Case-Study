package com.qualco.casestudy.maxgdp;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MaxGdpPerCapitaId implements Serializable {
	private Integer year;
	private Long population;
	private Long gdp;
	
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MaxGdpPerCapitaId)) return false;
		MaxGdpPerCapitaId that = (MaxGdpPerCapitaId) o;
		return getYear().equals(that.getYear()) && getPopulation().equals(that.getPopulation()) && getGdp().equals(that.getGdp());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getYear(), getPopulation(), getGdp());
	}
}

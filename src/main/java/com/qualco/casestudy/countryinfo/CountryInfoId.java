package com.qualco.casestudy.countryinfo;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CountryInfoId implements Serializable {
	private String continent;
	private String region;
	private String country;
	
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CountryInfoId)) return false;
		CountryInfoId that = (CountryInfoId) o;
		return getContinent().equals(that.getContinent()) && getRegion().equals(that.getRegion()) && getCountry().equals(that.getCountry());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getContinent(), getRegion(), getCountry());
	}
}

package com.qualco.casestudy.maxgdp;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MaxGdpPerCapitaId implements Serializable {
	private String country;
	private String code;
	
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MaxGdpPerCapitaId)) return false;
		MaxGdpPerCapitaId that = (MaxGdpPerCapitaId) o;
		return getCountry().equals(that.getCountry()) && getCode().equals(that.getCode());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getCountry(), getCode());
	}
}

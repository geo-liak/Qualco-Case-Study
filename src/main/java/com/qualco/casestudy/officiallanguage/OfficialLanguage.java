package com.qualco.casestudy.officiallanguage;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class OfficialLanguage {
	@Id
	private Long languageId;
	private String language;
	private int official;
	
	public OfficialLanguage() {
	}
	
	public OfficialLanguage(Long languageId, String language, int official) {
		this.languageId = languageId;
		this.language = language;
		this.official = official;
	}
	
	public Long getLanguageId() {
		return languageId;
	}
	
	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public int getOfficial() {
		return official;
	}
	
	public void setOfficial(int official) {
		this.official = official;
	}
}

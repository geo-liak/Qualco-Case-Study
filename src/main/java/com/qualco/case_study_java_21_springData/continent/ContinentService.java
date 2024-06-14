package com.qualco.case_study_java_21_springData.continent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentService {
	
	@Autowired
	private ContinentRepo repo;
	
	public List<Continent> getAllContinents() {
		return repo.findAll();
	}
	
}

package com.qualco.casestudy.country;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CountryRepo extends Repository<Country, Long> {
	
	@Query(value = "select c.country_id, c.name, c.area, c.country_code2 from countries c order by c.name", nativeQuery = true)
	
	public List<Country> getCountries();
	
}

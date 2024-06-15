package com.qualco.casestudy.officiallanguage;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfficialLanguageRepo extends Repository<OfficialLanguage, Long> {
	
	@Query(value = "select c.name as country, l.language_id, l.language, cl.official from countries c " +
			"inner join country_languages cl on cl.country_id = c.country_id " +
			"inner join languages l on l.language_id = cl.language_id " +
			"where c.country_id = :countryId " +
			"order by cl.official desc", nativeQuery = true)
	
	List<OfficialLanguage> findOfficialLanguagesByCountryId(@Param("countryId") Long countryId);
}

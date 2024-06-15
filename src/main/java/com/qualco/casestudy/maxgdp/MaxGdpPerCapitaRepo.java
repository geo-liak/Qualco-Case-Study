package com.qualco.casestudy.maxgdp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaxGdpPerCapitaRepo extends CrudRepository<MaxGdpPerCapitaDTO, MaxGdpPerCapitaId> {
	
	@Query(value = "SELECT c.name AS country, c.country_code3 AS code, cs.year, cs.population, cs.gdp, (cs.gdp / cs.population) AS max_gdp_per_capita FROM countries c " +
			"LEFT JOIN  country_stats cs ON cs.country_id = c.country_id " +
			"INNER JOIN (" +
			"    SELECT cs.country_id, MAX(cs.gdp / cs.population) AS max_gdp_per_capita " +
			"    FROM  country_stats cs GROUP BY cs.country_id) max_gdp_per_capita_subquery " +
			"    ON cs.country_id = max_gdp_per_capita_subquery.country_id " +
			"    AND (cs.gdp / cs.population) = max_gdp_per_capita_subquery.max_gdp_per_capita " +
			"ORDER BY " +
			"    c.name;", nativeQuery = true)
	List<MaxGdpPerCapitaDTO> getMaxGdpPerCapita();
}

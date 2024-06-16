package com.qualco.casestudy.maxgdp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaxGdpPerCapitaRepo extends CrudRepository<MaxGdpPerCapitaDTO, MaxGdpPerCapitaId> {
	
	@Query(value = "SELECT " +
			"    c.name as country, c.country_code3 as code, cs.year, cs.population, cs.gdp " +
			"FROM " +
			"    countries c " +
			"LEFT JOIN " +
			"    (SELECT " +
			"            cs1.country_id, cs1.year, cs1.population, cs1.gdp " +
			"        FROM " +
			"            country_stats cs1 " +
			"        JOIN " +
			"            ( " +
			"                SELECT " +
			"                    country_id, MAX(gdp / population) AS max_gdp_per_capita " +
			"                FROM " +
			"                    country_stats " +
			"                WHERE " +
			"                    population > 0 " +
			"                GROUP BY " +
			"                    country_id " +
			"            ) cs2 ON cs1.country_id = cs2.country_id " +
			"               AND (cs1.gdp / cs1.population) = cs2.max_gdp_per_capita " +
			"    ) cs ON c.country_id = cs.country_id " +
			"ORDER BY " +
			"    c.name;", nativeQuery = true)
	List<MaxGdpPerCapitaDTO> getMaxGdpPerCapita();
}

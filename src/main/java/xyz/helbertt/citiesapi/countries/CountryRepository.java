package xyz.helbertt.citiesapi.countries;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.helbertt.citiesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

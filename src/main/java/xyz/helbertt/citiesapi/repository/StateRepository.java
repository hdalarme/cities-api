package xyz.helbertt.citiesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.helbertt.citiesapi.staties.State;

public interface StateRepository extends JpaRepository<State, Long> {
}

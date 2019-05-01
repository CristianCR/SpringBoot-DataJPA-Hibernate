package es.cristian.example.dao;

import es.cristian.example.model.CarRent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentRepo extends JpaRepository<CarRent, Integer> {

}

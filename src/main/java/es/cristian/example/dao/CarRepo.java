package es.cristian.example.dao;

import es.cristian.example.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Integer> {

}

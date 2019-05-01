package es.cristian.example.service;

import es.cristian.example.model.Car;

import java.util.List;

public interface IDemoService {

    List<Car> find();

    void save();

}

package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> show();
    List<Car> show(int count);
}

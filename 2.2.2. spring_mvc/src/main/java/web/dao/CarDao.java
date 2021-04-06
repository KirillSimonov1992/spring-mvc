package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> show();
    List<Car> show(int count);
}

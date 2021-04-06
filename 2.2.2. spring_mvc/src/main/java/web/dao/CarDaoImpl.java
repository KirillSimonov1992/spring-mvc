package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>(5);
        cars.add(new Car("toyota", "grey"));
        cars.add(new Car("nexia", "black"));
        cars.add(new Car("cayene", "red"));
        cars.add(new Car("UAZ", "blue"));
        cars.add(new Car("twelve", "green"));
    }

    public CarDaoImpl() {
    }

    @Override
    public List<Car> show() {
        return cars;
    }

    @Override
    public List<Car> show(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDaoImpl carDao;

    @Override
    public List<Car> show() {
        return carDao.show();
    }

    @Override
    public List<Car> show(int count) {
        return carDao.show(count);
    }
}

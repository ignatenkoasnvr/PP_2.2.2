package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Audi", "7", 2006));
            carList.add(new Car("MB", "E class", 2004));
            carList.add(new Car("Ford", "F-150", 2015));
            carList.add(new Car("Toyota", "Camry", 2008));
            carList.add(new Car("Bmw", "5", 2020));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
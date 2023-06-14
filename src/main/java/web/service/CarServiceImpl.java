package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("audi", "4 series", "4"));
        cars.add(new Car("Bmv", "5", "E39"));
        cars.add(new Car("ford", "Model-T", "1"));
        cars.add(new Car("MB", "E-classe", "3"));
        cars.add(new Car("UAZ", "Patriot", "2"));
    }

    @Override
    public List<Car> getCarList(int count) {

        if (count < 0){
            return cars;
        } else if (count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
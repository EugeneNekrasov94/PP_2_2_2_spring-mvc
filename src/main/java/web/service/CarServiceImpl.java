package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(1L, "BMW", 50000));
        cars.add(new Car(2L, "Lexus", 40000));
        cars.add(new Car(3L, "Lada", 20000));
        cars.add(new Car(4L, "FAW", 25000));
        cars.add(new Car(5L, "Ferrari", 100000));
    }

    @Override
    public List<Car> getCars(int n) {
        return cars.stream().filter(c -> cars.indexOf(c) < n).collect(Collectors.toList());
    }
}

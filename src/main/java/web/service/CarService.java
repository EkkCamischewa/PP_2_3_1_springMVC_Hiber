package web.service;

import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static final List<Car> cars = Arrays.asList(
            new Car("Ford",234,2005),
            new Car("Nissan",555,2001),
            new Car("BMV",789,2023),
            new Car("Ford",16,1999),
            new Car("Nissan",45,2002));


    public static List<Car> getListCars(int a) {
        if (a >= 5 | a == 0) {
            return cars;
        }
        return cars.stream().limit(a).collect(Collectors.toList());
    }
}

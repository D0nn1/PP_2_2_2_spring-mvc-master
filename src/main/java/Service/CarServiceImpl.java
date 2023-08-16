package Service;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Honda", "a555xc77", "black"));
        cars.add(new Car("Mitsubishi", "x754yc93", "red"));
        cars.add(new Car("Mazda", "oo001oo102", "white"));
        cars.add(new Car("Subaru", "a154cc05", "grey"));
        cars.add(new Car("Mazda", "o001oo102", "white"));
    }

    public List<Car> getListOfCars(int number) {
        return cars.stream().limit(number).toList();
    }

}

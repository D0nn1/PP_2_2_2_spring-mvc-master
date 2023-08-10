package Service.dao;

import Service.Model.Car;

import java.util.ArrayList;

public interface CarDao {

    public static ArrayList<Car> certainNumberOfCars(int number) {
        ArrayList<Car> cars = new ArrayList<>();
        if (number > 0) cars.add(new Car("Honda", "a555xc77", "black"));
        if (number > 1) cars.add(new Car("Mitsubishi", "x754yc93", "red"));
        if (number > 2) cars.add(new Car("Mazda", "oo001oo102", "white"));
        if (number > 3) cars.add(new Car("Subaru", "a154cc05", "grey"));
        if (number > 4) cars.add(new Car("Mazda", "o001oo102", "white"));
        return cars;
    }

}

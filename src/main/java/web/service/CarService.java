package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component

public class CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Grey", "Crossover"));
        carList.add(new Car("Lexus", "White", "Sedan"));
        carList.add(new Car("Nissan", "Blue", "Hatchback"));
        carList.add(new Car("Audi", "Black", "Sedan"));
        carList.add(new Car("Honda", "Red", "SUV"));
    }

    public List<Car> getCarList(){
        return carList;
    }

    public List<Car> countOfCars(int count) {
        return carList.stream().limit(count).toList();
    }
}

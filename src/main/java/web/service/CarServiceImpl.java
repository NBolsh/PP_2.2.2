package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Grey", "Crossover"));
        carList.add(new Car("Lexus", "White", "Sedan"));
        carList.add(new Car("Nissan", "Blue", "Hatchback"));
        carList.add(new Car("Audi", "Black", "Sedan"));
        carList.add(new Car("Honda", "Red", "SUV"));
    }
    @Override
    public List<Car> getCarList(Integer count){
        if (count!= null) {
            return carList.stream().limit(count).toList();
        } else {
            return carList;
        }
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String listOfCars(@RequestParam(value = "count", required = false) Integer count,
            Model model){
        /*
        Решил использовать "Integer" в запрашиваемом параметре, потому что без него возникает исключение
        */

        if (count != null) {
            model.addAttribute("carsCount", count >= 5 ? carService.getCarList() : carService.countOfCars(count));
        } else {
            model.addAttribute("carsCount", carService.getCarList());
        }
        return "/cars";
    }

}

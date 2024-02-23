package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
class CarController {

    @GetMapping()
    public String car(@RequestParam(value = "count", defaultValue = "5") int a, ModelMap model){
        List<Car> cars = CarService.getListCars(a);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null || count >= 5) {
            model.addAttribute("cars", carService.getAllCars());
        } else if (count > 0) {
            model.addAttribute("cars", carService.getCarsByCount(count));
        } else {
            model.addAttribute("errorMessage", "ERROR: Make request with valid " +
                    "count parameter (count greater than zero)");
        }
        return "cars";
    }
}

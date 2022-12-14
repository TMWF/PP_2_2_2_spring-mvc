package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car(Car.Type.HATCHBACK, "LADA Granta", "TSHGYW89377462734"));
        cars.add(new Car(Car.Type.SEDANE, "BMW 520", "XWG8371873837"));
        cars.add(new Car(Car.Type.HATCHBACK, "Citroen C4", "KIE8387D7643"));
        cars.add(new Car(Car.Type.SUV, "Mercedes-Benz Helenvagen", "UJD38947I789237"));
        cars.add(new Car(Car.Type.SUV, "Toyota Tundra", "SFWT7263H28378327"));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCarsByCount(int count) {
        return cars.subList(0, count);
    }
}

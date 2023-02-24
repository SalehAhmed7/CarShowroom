package com.example.demo.car;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/cars")
public class VehicleController {

    @GetMapping
    public List<Car> getAllCars(){
        List<Car> cars = Arrays.asList(
                new Car(
                        1L,
                        Type.SPORTS,
                        "BMW",
                        "M3",
                        40_000),

                new Car(
                        2L,
                        Type.SPORTS,
                        "Mercedes",
                        "C63",
                        60_000)

        );

                return cars;

    }

}

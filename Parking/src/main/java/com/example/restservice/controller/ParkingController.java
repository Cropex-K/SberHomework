package com.example.restservice.controller;


import com.example.restservice.bean.Car;
import com.example.restservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ParkingController {

    private final CarService carService;

    @Autowired
    public ParkingController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/free")
    public String free() {
        return String.valueOf(carService.free());
    }


    @PostMapping("/park")
    public void park(@RequestBody String nameCar){
            Car car = new Car(nameCar);
            carService.park(car);
            }


    @PostMapping("/unpark")
    public void unpark(@RequestBody Integer number){
       carService.unpark(number);
        }

    }




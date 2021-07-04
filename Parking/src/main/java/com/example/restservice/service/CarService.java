package com.example.restservice.service;

import com.example.restservice.bean.Car;

public interface CarService {

    String getNameCar(Integer number);

    String park(Car car);

    String free();

    String unpark(Integer number);

    int getPlace();


}

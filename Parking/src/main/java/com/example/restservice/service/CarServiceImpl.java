package com.example.restservice.service;

import com.example.restservice.bean.Car;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService{

    private static int count;
    private static final Map<Integer,String> park = new HashMap<>();

    @Override
public String getNameCar(Integer number){
    return park.get(number);
}

    @Override
    public String park(Car car) {
        if (count<20) {
            park.put(count, car.getName());
            count++;
            return String.format("Ваша машина %s, успешно припаркованa на месте %d",car.getName(),count);
        }
        else{
            return "We don't have free space";
        }
    }

    @Override
    public String free() {
        return String.valueOf(20 - count);
    }

    @Override
    public String unpark(Integer number) {
        if (park.containsKey(number)){
        String name = park.remove(number);
        String res =String.format("Ваша машина %s, с места %d может уехать",name, number);
        count--;
        return res;}
        else {
            return "Wrong number";
        }
    }

    @Override
    public int getPlace() {
        return count;
    }
}

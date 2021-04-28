package com.zoo.animal;

import com.zoo.exception.SomeException2;
import com.zoo.exception.WrongDataException;

import java.util.ArrayList;
import java.util.List;

public class Aviary {

    private String name;
    private int count;
    private static int countAviary = 5;
    private List<Animal> cage;
    private static List<List> cages;

    public Aviary(String name, int count) {
        if (countAviary==0){
            System.out.println("Извините, больше вальеров нет");
        }
        else {
            this.name = name;
            this.count = count;
            this.cage = new ArrayList<>();
            countAviary--;
        }
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public List<Animal> getCage() {
        return cage;
    }

    public void add(Animal animal) throws SomeException2, WrongDataException {

        if (cage.size()==count){
            throw new SomeException2();
        }
        else if (cage.contains(animal)){
            throw new WrongDataException();
        }
        else{
            this.cage.add(animal);
        }


    }

    public void delete(Animal animal){
        this.cage.remove(animal);
    }
}

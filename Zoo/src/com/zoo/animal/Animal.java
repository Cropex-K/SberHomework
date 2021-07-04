package com.zoo.animal;

import com.zoo.exception.SomeException2;
import com.zoo.exception.WrongDataException;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void say();

    public abstract void eat();

    public abstract void play();

    public void giveTreat (int i) throws WrongDataException {
        if (i<=0){
            throw new WrongDataException();
        }
       else{
           System.out.println("Вы угостили животное "+ i+ " раз");
        }
    }

    public void giveTreat (String s) throws SomeException2 {
        if (s.equals(null)){
            throw new SomeException2();
        }
        else{
            System.out.println("Вы угостили животное вкусняшкой - "+ s);
        }
    }

    public void addToAviary(String nameOfAviary, Aviary aviary) throws SomeException2, WrongDataException {
        if (nameOfAviary.equals(aviary.getName())) {
            aviary.add(this);
        }
        else {
            throw new WrongDataException();
        }
    }

}


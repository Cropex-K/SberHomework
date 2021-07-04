package com.zoo.animal;

public class Lama extends Animal implements Moveable, Sleepable{

    @Override
    public void say() {
        System.out.println("Мее");
    }

    @Override
    public void eat() {
        System.out.println("Ест сено");
    }

    @Override
    public void play() {
        System.out.println("Бегает по вольеру");
    }
}

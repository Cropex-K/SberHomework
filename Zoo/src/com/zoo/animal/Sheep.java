package com.zoo.animal;

public class Sheep extends Animal implements Moveable,Sleepable {
    @Override
    public void say() {
        System.out.println("Бее");
    }

    @Override
    public void eat() {
        System.out.println("Ест траву");
    }

    @Override
    public void play() {
        System.out.println("Лежит на солнышке");
    }
}

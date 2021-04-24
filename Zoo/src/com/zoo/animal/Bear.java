package com.zoo.animal;

public class Bear extends Animal implements Moveable, Sleepable {

    @Override
    public void say() {
        System.out.println("Раааар (ну а что говрят медведи?)");
    }

    @Override
    public void eat() {
        System.out.println("Ест рыбу");
    }

    @Override
    public void play() {
        System.out.println("Плавает в бассейне");
    }
}

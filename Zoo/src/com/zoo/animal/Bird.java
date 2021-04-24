package com.zoo.animal;

public class Bird extends Animal implements Moveable, Sleepable {
    @Override
    public void say() {
        System.out.println("Чирик - чирик");
    }

    @Override
    public void eat() {
        System.out.println("Птица ест зернышки");
    }

    @Override
    public void play() {
        System.out.println("Летает по вольеру");
    }
}

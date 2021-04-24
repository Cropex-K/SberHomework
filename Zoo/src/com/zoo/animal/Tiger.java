package com.zoo.animal;

public class Tiger extends Animal implements Moveable,Sleepable{
    @Override
    public void say() {
        System.out.println("Ррр-ррр");
    }

    @Override
    public void eat() {
        System.out.println("Тигр ест мясо");
    }

    @Override
    public void play() {
        System.out.println("Играет с мячиком");
    }
}

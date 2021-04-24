package com.zoo.animal;

public interface Moveable {

    public default void move(){
        System.out.println("бегает");
    }
}

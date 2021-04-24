package com.zoo.animal;

public interface Sleepable {

    public default void sleep(){
        System.out.println("спит");
    }
}

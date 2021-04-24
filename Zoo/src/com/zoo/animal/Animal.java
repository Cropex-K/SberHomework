package com.zoo.animal;

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

    public void giveTreat (int i){
        System.out.println("Вы угостили животное "+ i+ " раз");
    }

    public void giveTreat (String s){
        System.out.println("Вы угостили животное вкусняшкой - "+ s);
    }

}


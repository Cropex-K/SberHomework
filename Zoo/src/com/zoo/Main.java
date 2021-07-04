package com.zoo;

import com.zoo.animal.Aviary;
import com.zoo.animal.Bear;
import com.zoo.animal.Lama;
import com.zoo.animal.Tiger;
import com.zoo.exception.SomeException2;
import com.zoo.exception.WrongDataException;

public class Main {
    public static void main(String[] args) throws SomeException2, WrongDataException {

        Lama lama1 = new Lama();
        try {
            lama1.giveTreat(-1);
        } catch (WrongDataException e) {
            System.out.println("Неправильное количество вкусняшек :)");;
        }

        try {
            lama1.giveTreat(null);
        } catch (SomeException2 someException2) {
            System.out.println("Необходимо дать существующую вкусняшку");;
        }

        //создаем вольеры и животных, чтобы добавить их туда

        Aviary aviary1 = new Aviary("Tigers", 2);
        Aviary aviary2 = new Aviary("Lamas", 3);

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();
        Tiger tiger3 = new Tiger();
        Lama lama2 = new Lama(); //первая добавлена выше


        tiger1.addToAviary("Tigers", aviary1);
        tiger2.addToAviary("Tigers", aviary1);
        tiger3.addToAviary("Tigers", aviary1); //ошибка, так как место закончилось

        lama1.addToAviary("Lamas", aviary2);
        lama2.addToAviary("Lamas", aviary2);
        lama2.addToAviary("Lamas", aviary2); //ошибка, так как это животное уже там есть

        Aviary aviary3 = new Aviary("Bear", 2);
        Bear bear = new Bear();
        bear.addToAviary("Tigers", aviary3); //ошибка, так как такого вольера не существует
    }
}

package com.zoo;

import com.zoo.animal.Aviary;
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

        aviary1.add(tiger1);
        aviary1.add(tiger2);
        aviary1.add(tiger3); //ошибка, так как место закончилось

        aviary2.add(lama1);
        aviary2.add(lama2);
        aviary2.add(lama2); //ошибка, так как это животное уже там есть

        //нельзя добавить животное в несуществующий вольер, идея не даст :)
    }
}

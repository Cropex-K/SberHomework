package com.zoo;

import com.zoo.animal.Lama;
import com.zoo.exception.SomeException2;
import com.zoo.exception.WrongDataException;

public class Main {
    public static void main(String[] args) {

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
    }
}

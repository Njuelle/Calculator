package com.example.nico.calculator;

/**
 * Created by Nico on 04/10/2016.
 */

public class Calculator {

    static String save;

    /*public Calculator(String save) {
        this.save = save;
    }*/

    public static String getSave() {
        return save;
    }

    public static void setSave(String save) {
        Calculator.save = save;
    }
}

package com.example.nico.calculator;

/**
 * Created by Nico on 04/10/2016.
 */

public class Calculator {

    static String save = "0";

    public static String getSave() {
        return save;
    }

    public static void setSave(String save) {
        Calculator.save = save;
    }

    /**
     * make the calculation with calc string
     * @param calc
     * @return double
     */
    public double calculate(String calc) {
        double result = 0;

        if (calc.contains("+")) {
            String[] numbers = calc.split("\\+");
            result = add(numbers);
        }
        if (calc.contains("-")) {
            String[] numbers = calc.split("\\-");
            result = sub(numbers);
        }
        if (calc.contains("X")) {
            String[] numbers = calc.split("X");
            result = multiplication(numbers);
        }
        if (calc.contains("/")) {
            String[] numbers = calc.split("/");
            result = division(numbers);
        }
        return result;
    }

    /**
     * addition between 2 numbers in string array
     * @param numbers
     * @return double
     */
    private double add(String[] numbers){
        double result = 0;
        if (checkNegativeNumbers(numbers)){
            return result;
        }
        for (String number : numbers) {
            result += Double.parseDouble(number);
        }
        return result;
    }

    /**
     * subtraction between 2 numbers in string array
     * @param numbers
     * @return double
     */
    private double sub(String[] numbers){
        if (checkNegativeNumbers(numbers)){
            return 0;
        }
        double result = Double.parseDouble(numbers[0]);
        result -= Integer.parseInt(numbers[1]);
        return result;
    }

    /**
     * multiplication between 2 numbers in string array
     * @param numbers
     * @return double
     */
    private double multiplication(String[] numbers){
        if (checkNegativeNumbers(numbers)){
            return 0;
        }
        return Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]);
    }

    /**
     * division between 2 numbers in string array
     * @param numbers
     * @return double
     */
    private double division(String[] numbers){
        if (checkNegativeNumbers(numbers)){
            return 0;
        }
        if (Double.parseDouble(numbers[1]) == 0){
            return 0;
        }
        return Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
    }

    /**
     * check if there is negative numbers in numbers array
     * @param numbers
     * @return boolean
     */
    private boolean checkNegativeNumbers(String[] numbers){
        for (String number : numbers) {
            if (number.contains("-")){
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     * Check if there is two number on string
     * @param calc
     * @return boolean
     */
    public boolean checkTwoNumbers(String calc) {
        boolean isTwoNumber = false;
        String[] numbers = calc.split("[-+X/]");
        if (numbers.length > 1) {
            isTwoNumber = true;
        }
        return isTwoNumber;
    }

}

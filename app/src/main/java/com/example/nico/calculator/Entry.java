package com.example.nico.calculator;

import java.util.Arrays;
import java.util.List;



/**
 * Created by Nico on 11/10/2016.
 */

public final class Entry {

    private static List<String> operators = Arrays.asList("+", "-", "X", "/");
    private static List<String> scientistOperators = Arrays.asList("sin", "cos", "tan");
    static String save = "0";

    public static String getSave() {
        return save;
    }

    public static void setSave(String save) {
        Entry.save = save;
    }


    public static String checkText(String tag, String originText) {
        String entry = tag;
        if (isNumeric(tag)) {
             entry = checkNumbers(tag, originText);
        }
        if (isOperator(tag)) {
            entry = checkOperator(tag, originText);
        }
        if (isDot(tag)) {
            entry = checkDot(originText);
        }
        if (isScientistOperator(tag)) {
            entry = checkScientistOperator(tag, originText);
        }
        return entry;

    }

    private static String checkNumbers(String numbers, String originText) {
        if (originText.equals("0")) {
            return numbers;
        } else {
            return originText + numbers;
        }
    }

    private static String checkDot(String originText) {
        String lastDigit = originText.substring(originText.length() - 1);
        if (isNumeric(lastDigit)) {
            return originText + ".";
        }
        return originText;
    }

    private static String checkOperator(String operator, String originText) {
        if (originText.equals("0")) {
            return "0";
        }
        for (String temp : operators) {
            if (originText.contains(temp)){
                return originText + "";
            }
        }
        return originText + operator;
    }

    private static String checkScientistOperator(String operator, String originText) {
        if (isNumeric(originText)) {
            return operator + "(" + originText + ")";
        }
        return originText;
    }

    private static boolean isOperator(String str) {
        if (operators.contains(str)){
            return true;
        }
        return false;
    }

    private static boolean isScientistOperator(String str) {
        if (scientistOperators.contains(str)){
            return true;
        }
        return false;
    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    private static boolean isDot(String str) {
        if (str.equals(".")){
            return true;
        }
        return false;
    }


}

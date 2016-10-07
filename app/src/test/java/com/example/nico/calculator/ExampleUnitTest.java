package com.example.nico.calculator;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void additionIsCorrect() throws Exception {
        Calculator calc = new Calculator();
        assert(4 == calc.calculate("2+2"));
    }

    @Test
    public void subtractionIsCorrect() throws Exception {
        Calculator calc = new Calculator();
        assert(4 == calc.calculate("6-2"));
    }

    @Test
    public void multiplicationIsCorrect() throws Exception {
        Calculator calc = new Calculator();
        assert(12 == calc.calculate("6X2"));
    }

    @Test
    public void divisionIsCorrect() throws Exception {
        Calculator calc = new Calculator();
        assert(3 == calc.calculate("6/2"));
    }

    @Test
    public void checkTwoNumberIsTrue() throws Exception {
        Calculator calc = new Calculator();
        assert(calc.checkTwoNumbers("6/2+") == true);
    }

    @Test
    public void checkTwoNumberIsFalse() throws Exception {
        Calculator calc = new Calculator();
        assert(calc.checkTwoNumbers("6") == false);
    }
}
package com.test.others.classloader.example;

import com.test.others.classloader.cat.ICalculator;

public class CalculatorAdvanced implements ICalculator {

    public String calculate(String expression) {
        return "Result is " + expression;
    }

    public String getVersion() {
        return "2.0";
    }

}

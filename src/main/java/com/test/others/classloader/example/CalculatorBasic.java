package com.test.others.classloader.example;

import com.test.others.classloader.cat.ICalculator;

public class CalculatorBasic implements ICalculator {

    @Override
    public String calculate(String expression) {
        return expression;
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

}

package com.company;

public class Division implements Operation {

    @Override
    public double calculate(int a, int b) {
            double result = (double) a / b;
            return result;

    }


}

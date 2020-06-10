package com.company;

public class Subtraction implements Operation {

    @Override
    public double calculate(int a, int b) {
        int result=a-b;
        return result;

    }

}

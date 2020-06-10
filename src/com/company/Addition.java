package com.company;

public class Addition implements Operation {

    @Override
    public double calculate(int a, int b) {
        int result=a+b;
        return result;
    }

}

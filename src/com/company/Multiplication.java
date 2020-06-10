package com.company;

public class Multiplication implements Operation {

    @Override
    public double calculate(int a, int b) {
        int result=a*b;
        return result;

    }


}

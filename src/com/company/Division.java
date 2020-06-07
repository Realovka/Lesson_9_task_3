package com.company;

public class Division implements Operation {
    @Override
    public double calculate(int a, int b) {
        return (double) a/(double) b;
    }
}

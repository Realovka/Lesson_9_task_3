package com.company;

public class Subtraction implements Operation {
    double result;
    @Override
    public double calculate(int a, int b) {
        result=a-b;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%.0f", result);
    }
}

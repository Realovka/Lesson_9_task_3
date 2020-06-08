package com.company;

public class Division implements Operation {
    double result;
    @Override
    public double calculate(int a, int b) {
        result=(double)a/b;
        return result ;
    }

    @Override
    public String toString() {
        return String.format("%.2f", result);
    }
}

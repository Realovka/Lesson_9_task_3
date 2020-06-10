package com.company;

public class Division implements Operation {
    double result;
    @Override
    public void calculate(int a, int b) {
        result=(double)a/b;
        System.out.printf("%.2f", result);
        System.out.println();
    }


}

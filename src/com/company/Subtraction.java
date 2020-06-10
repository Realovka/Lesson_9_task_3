package com.company;

public class Subtraction implements Operation {
    int result;
    @Override
    public void calculate(int a, int b) {
        result=a-b;
        System.out.println("Результат операции "+result);

    }

}

package com.company;

public class Multiplication implements Operation {
    int result;
    @Override
    public void calculate(int a, int b) {
        result=a*b;
        System.out.println("Результат операции "+result);

    }


}

package com.company;


import java.util.Scanner;

public class Application {
    private Scanner scanner=new Scanner(System.in);
    private Scanner scanner1=new Scanner(System.in);
    private Scanner scanner2=new Scanner(System.in);
    Addition addition=new Addition();
    Subtraction subtraction=new Subtraction();
    Multiplication multiplication=new Multiplication();
    Division division=new Division();
    boolean f=true;



    public  void calculator() {
        while (f) {
            showMenu();
            System.out.println("Какую операцию хотите провести над числами?");
            int c = scanner2.nextInt();


            if (c == 0) {
                f = false;
            } else {
                if (c > 4 || c < 0) {
                    System.out.println("Нет такой операции");
                } else {

                    System.out.println("Введите первое число");
                    int a = scanner.nextInt();
                    System.out.println("Введите второе число");
                    int b = scanner1.nextInt();

                    if (c == 1) {
                        System.out.println("Результат операции " + addition.calculate(a, b));
                    } else if (c == 2) {
                        System.out.println("Результат операции " + subtraction.calculate(a, b));
                    } else if (c == 3) {
                        System.out.println("Результат операции " + multiplication.calculate(a, b));
                    } else if (c == 4) {
                        System.out.print("Результат операции ");
                        System.out.printf("%.2f",  division.calculate(a, b));
                        System.out.println();
                    }
                }
            }

        }
    }

    private void showMenu(){
        System.out.println("Калькулятор");
        System.out.println("0-выход");
        System.out.println("1-сложение");
        System.out.println("2-вычитание");
        System.out.println("3-умножение");
        System.out.println("4-деление");

    }

}

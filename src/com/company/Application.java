package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);
    private Scanner scanner1 = new Scanner(System.in);
    private Scanner scanner2 = new Scanner(System.in);
    Operation operation;
    Operation addition = new Addition();
    Operation subtraction = new Subtraction();
    Operation multiplication = new Multiplication();
    Operation division = new Division();
    boolean f = true;


    public void calculator() {
        while (f) {
            showMenu();
            System.out.println("Какую операцию хотите провести над числами?");
            int c = scanner.nextInt();
            System.out.println("Введите два числа");
            int a = scanner1.nextInt();
            int b = scanner2.nextInt();

            ArrayList<Operation> arrayList = new ArrayList<>();
            arrayList.add(operation);
            arrayList.add(addition);
            arrayList.add(subtraction);
            arrayList.add(multiplication);
            arrayList.add(division);

            try {
                if (c == 0) {
                    break;
                } else {
                    arrayList.get(c).calculate(a, b);
                }

            } catch (IndexOutOfBoundsException e){
                System.out.println("Нет такого действия");
            }
        }
    }

    private void showMenu() {
        System.out.println("Калькулятор");
        System.out.println("0-выход");
        System.out.println("1-сложение");
        System.out.println("2-вычитание");
        System.out.println("3-умножение");
        System.out.println("4-деление");

    }

}

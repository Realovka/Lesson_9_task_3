package com.company;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

import java.util.*;

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
        Map<Integer, Operation> operations = new HashMap<>();
        operations.put(0,operation);
        operations.put(1,addition);
        operations.put(2,subtraction);
        operations.put(3,multiplication);
        operations.put(4,division);

        while (f) {
            showMenu();
            System.out.println("Какую операцию хотите провести над числами?");
            int c = scanner.nextInt();
            System.out.println("Введите два числа");
            int a = scanner1.nextInt();
            int b = scanner2.nextInt();

            if (c >= operations.size()) {
                System.out.println("Нет такого действия");
            } else {
                if (c == 0) {
                    break;
                } else {
                    if (operations.get(c).calculate(a, b) % 1 == 0) {
                        System.out.printf("%.0f", operations.get(c).calculate(a, b));
                    } else {
                        if (operations.get(c).calculate(a, b) % 1 != 0 && Double.isFinite(operations.get(c).calculate(a, b)) &&
                                !Double.isNaN(operations.get(c).calculate(a, b))) {
                            System.out.printf("%.2f", operations.get(c).calculate(a, b));
                        }
                        if (Double.isInfinite(operations.get(c).calculate(a, b)) || Double.isNaN(operations.get(c).calculate(a, b))) {
                            System.out.println("Делить на 0 нельзя");
                        }
                    }
                    System.out.println();

                }

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


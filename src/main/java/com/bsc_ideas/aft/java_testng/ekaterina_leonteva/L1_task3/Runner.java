package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3;

import java.util.Scanner;
import java.lang.*;

public class Runner {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = getOperation();
        double result = calculate(firstNumber, secondNumber, operation);
        if (result == Double.POSITIVE_INFINITY) {
            System.out.println("Предупреждение: Деление на 0 невозможно");
        } else {

            System.out.print("Результат вычисления равен " + result);
        }
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одну из арифметических операций: «+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Пожалуйста, введите одну из операций");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.print("Пожалуйста, введите число");
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static double calculate(double firstNumber, double secondNumber, char operation) {
        switch (operation) {
            case '+':
                return addition(firstNumber, secondNumber);
            case '-':
                return subtraction(firstNumber, secondNumber);
            case '*':
                return multiplication(firstNumber, secondNumber);
            case '/':
                return division(firstNumber, secondNumber);
            default:
                System.out.println("Операция не найдена");
                return calculate(firstNumber, secondNumber, getOperation());
        }
    }

    public static double division(double x, double y) {

        return x / y;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double addition(double x, double y) {
        return x + y;
    }

}

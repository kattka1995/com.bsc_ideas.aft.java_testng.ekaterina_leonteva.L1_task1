package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3;

import java.util.Scanner;

public class Runner {//Леонтьева Екатерина Андреевна. Задание 3. Написать калькулятор – программа, которая на входе получает два целых числа (число А и число В),
    // выполняет арифметическую операцию («+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление) и выводит результат в консоль.
    // Для каждой операции использовать отдельный метод (нельзя использовать методы библиотечного класса Math).
    // Предусмотреть пользовательское меню для выбора необходимой операции. Ввод входных данных осуществлять с клавиатуры.
    static private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws MyException {
        Runner runner = new Runner();
        int firstNumber = getInt();
        int secondNumber = getInt();
        char operation = getOperation();
        double result = runner.calculate(firstNumber, secondNumber, operation);
        System.out.print("Результат вычисления равен " + result);//вывод в консоль результата вычисления
    }

    public static char getOperation() {//ввод операции в консоль
        System.out.println("Выберите одну из арифметических операций: «+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Пожалуйста, введите одну из операций");//повтор ввода в случае отсутствия операции в списке операций
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int getInt() {//ввод чисел в консоль
        System.out.print("Введите число ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.print("Пожалуйста, введите число");//повтор ввода, если было введено не число
            scanner.next();
            number = getInt();
        }
        return number;
    }

    public static double multiplication(double x, double y) {
        return x * y;
    }//выполнение операции умножения

    public static double subtraction(double x, double y) {
        return x - y;
    }//выполнение операции вычитания

    public static double addition(double x, double y) {
        return x + y;
    }//выполнение операции сложения

    public double calculate(double firstNumber, double secondNumber, char operation) throws MyException { //выполнение операции в зависимости от введенной в консоль
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
                System.out.println("Повторите ввод операции");
                return calculate(firstNumber, secondNumber, getOperation());
        }
    }

    public double division(double x, double y) throws MyException {//выполнение операции деления
        if (y == 0) {
            throw new MyException("Деление на ноль");
        }
        double rez = x / y;
        return rez;
    }

}

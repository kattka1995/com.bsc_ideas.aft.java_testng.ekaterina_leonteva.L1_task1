package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task3;

import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class Runner {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int firstNumber= getInt();
        int secondNumber = getInt();
        char operation= getOperation();
        int result = calculate (firstNumber,secondNumber,operation);
       // firstNumber = scanner.nextInt();
        System.out.print("Результат вычисления равен "+result);
        //secondNumber = scanner.nextInt();
     }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одну из арифметических операций: «+» - сложение, «-» - вычитание, «*» - умножение, «/» - деление");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        }else {
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
        public static int calculate(int firstNumber, int secondNumber, char operation) throws IOException {
            int result=0;
            switch (operation) {
                case  '+':
                    result=addition(firstNumber, secondNumber);
                    break;
                case '-':
                    result= subtraction(firstNumber, secondNumber);
                    ;
                    break;
                case  '*':
                    result=multiplication(firstNumber, secondNumber);
                    ;
                    break;
                case '/':
                    result=division(firstNumber, secondNumber);
                    ;
                    break;
                default:
                    System.out.println("Операция не найдена");
                    result = calculate(firstNumber, secondNumber, getOperation());
            }
            return result;
        }

        public static int division(int x, int y)throws IOException {
            try {
                return x/y;
            } catch (ArithmeticException Ex) {
                System.out.println("Делитель не должен быть 0");
            }
            return y;
        }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int addition(int x, int y) {
        return x + y;
    }

}

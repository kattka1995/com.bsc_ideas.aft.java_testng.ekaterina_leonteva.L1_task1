package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task2;

import java.util.Scanner;
import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк ");
        ArrayList<String> maxLineList = new ArrayList<String>();
        ArrayList<String> minLineList = new ArrayList<String>();
        while (!scanner.hasNextInt()) {
            try {
                String inputFieldOfCount = scanner.next();
                Integer.parseInt(inputFieldOfCount);

            } catch (NumberFormatException Ex) {
                System.out.println("Количество строк должно быть числом. \nВведите количество строк");
            }
        }

        int countOfLines = scanner.nextInt();
        int maxLineLength = Integer.MIN_VALUE;
        int minLineLength = Integer.MAX_VALUE;
        String countOfCharacters = null;
        for (int i = 1; i <= countOfLines; ++i) {
            System.out.println("Введите " + i + " строку");
            countOfCharacters = scanner.next();
            System.out.println("длина строки равна " + countOfCharacters.length());
            if (maxLineLength == countOfCharacters.length()) {
                maxLineList.add(countOfCharacters);
            } else if (maxLineLength < countOfCharacters.length()) {
                maxLineLength = countOfCharacters.length();
                maxLineList.clear();
                maxLineList.add(countOfCharacters);
            } else if (minLineLength > countOfCharacters.length()) {
                minLineLength = countOfCharacters.length();
                minLineList.add(countOfCharacters);
            } else if (minLineLength == countOfCharacters.length()) {
                minLineList.add(countOfCharacters);
            }
        }

        if (!"".equalsIgnoreCase(countOfCharacters)) {
            System.out.println("Наибольшая строка содержит " + maxLineLength + " символов и равна " + maxLineList);
            if (!minLineList.isEmpty()) {
                System.out.println("Наименьшая строка содержит " + minLineLength + " символов  и равна " + minLineList);
            }
        } else System.out.println("Повторите ввод");
    }

}

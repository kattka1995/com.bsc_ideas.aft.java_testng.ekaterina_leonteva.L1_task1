package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task2;

import java.io.IOException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String maxLine = new String();
        String minLine = new String();
        int maxLineLength = Integer.MIN_VALUE;
        int minLineLength = Integer.MAX_VALUE;
        System.out.print("Введите количество строк ");
        int countOfLines = 0;
        String countOfCharacters = "0";

        while (scanner.hasNextInt() == false) {
            try {
                String inputFieldOfCount = scanner.next();
                countOfLines = Integer.parseInt(inputFieldOfCount);
            } catch (NumberFormatException Ex) {
                System.out.println("Количество строк должно быть числом. Введите количество строк");
            }
        }
        countOfLines = scanner.nextInt();
        for (int i = 1; i <= countOfLines; ++i) {
            System.out.println("Введите " + i + " строку");
            countOfCharacters = scanner.next();
            System.out.println("длина строки равна " + countOfCharacters.length());
            if (countOfCharacters.length() > maxLineLength) {
                maxLineLength = countOfCharacters.length();
                maxLine = countOfCharacters;
            }

            if (countOfCharacters.length() < minLineLength) {
                minLineLength = countOfCharacters.length();
                minLine = countOfCharacters;
            }
        }

        if (countOfCharacters != "0") {
            if (maxLineLength != minLineLength) {
                System.out.println("Наибольшая строка содержит " + maxLineLength + " символов  и равна '" + maxLine + "'");
                System.out.println("Наименьшая строка содержит " + minLineLength + " символов  и равна " + minLine);
            } else {
                System.out.println("Наибольшая и наименьшая строка содержит " + minLineLength + " символов  и равна " + minLine);
            }
        }
    }

}

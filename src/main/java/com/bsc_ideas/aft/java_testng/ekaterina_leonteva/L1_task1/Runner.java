package com.bsc_ideas.aft.java_testng.ekaterina_leonteva.L1_task1;

public class Runner { //задание -В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным
    public static void main(String[] args) {
        int sample[] = new int[20];
        int i;
        for (i = 0; i <= 19; i++) {//исходный массив
            sample[i] = ((int) (Math.random() * 20) - 10); //заполнение массива
            System.out.print(sample[i] + " ");
        }
        System.out.println("\n");
        for (i = 0; i < 19; i++)//новый массив
        {
            if ((sample[i] > 0) & (sample[i + 1] < 0))
                sample[i] = sample[i] * 3;
            System.out.print(sample[i] + " ");
        }
        System.out.print(sample[19] + " ");
    }
}

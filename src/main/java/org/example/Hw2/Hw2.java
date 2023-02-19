package org.example.Hw2;

import java.util.Scanner;

/**
 2) Дана последовательность из N целых чисел.
 Верно ли, что последовательность является возрастающей.
 */
public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество цифр");
        int n = sc.nextInt();
        int[] array = new int[n];
        String str = "True";
        for (int i = 0; i < n ; i++) {
            System.out.println("Введите число: ");
            int k = sc.nextInt();
            array[i] = k;
        }

        for (int j = 1; j < n - 1; j++) {
            if (array[j] > array[j-1]) {
                str = "True";
            } else {
                str = "False";
            }
        }
        System.out.println(str);
    }
}

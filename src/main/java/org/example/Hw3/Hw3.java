package org.example.Hw3;

import java.util.Scanner;

/**
 * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму
 * индексов двузначных элементов массива
 */
public class Hw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String[] myNew = str.split(" ");
        int k = myNew.length;
        int [] item = new int[k];

        for(int i = 0; i < k;i++) {
            item[i] = Integer.parseInt(myNew[i]);
        }
        int sum = 0;
        for (int j = 0; j < k; j++) {
            if (item[j] % 10 > 1 && item[j] % 10 < 10) {
                sum += j;
            }
            if (item[j] % 10 < -1 && item[j] % 10 > -10) {
                sum += j;
            }
        }
        for (int l = 0; l < k; l++) {
            if (item[l] < 0) {
                item[l] = sum;
            }
            System.out.print(item[l] + " ");

        }
    }


}

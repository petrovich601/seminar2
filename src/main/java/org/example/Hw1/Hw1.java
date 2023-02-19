package org.example.Hw1;

import java.util.Scanner;
public class Hw1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 2;
        for (int i = 3; i < n; i+=2) {
            int k = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    k += 1;
                }
            }
            if (k == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}

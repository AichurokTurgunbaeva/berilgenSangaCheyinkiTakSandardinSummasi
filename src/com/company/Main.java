package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int oddSum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;

            }

        }
        System.out.println(oddSum);
    }

            }






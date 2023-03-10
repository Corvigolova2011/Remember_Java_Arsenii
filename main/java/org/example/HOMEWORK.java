package org.example;

import java.util.Scanner;

public class HOMEWORK {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();
        System.out.println((number_1 + number_2) * number_3);
    }
}

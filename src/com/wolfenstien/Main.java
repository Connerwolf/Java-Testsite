package com.wolfenstien;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        int a = input.nextInt();
        if (a>18)
            System.out.println("Result: Yes");
        else
            System.out.println("Result: No");
    }
}
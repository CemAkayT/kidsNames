package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Type 5 names, one at a time.");

        for (int i = 0; i < names.length; i++) {
            System.out.print("Type name "+ (i +1) + " : ");
            names[i] = scanner.nextLine();
        }
        System.out.println();
        System.out.print("The names are: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
        System.out.println();
    }
}

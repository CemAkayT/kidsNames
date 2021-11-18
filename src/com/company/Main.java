
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {

            Scanner scanner = new Scanner(System.in);
            System.out.print("How many kids do you have? ");
            int number = 0;
            number = scanner.nextInt();
            String[] names = new String[number];
            scanner.skip(System.lineSeparator());

            for (int i = 0; i < number; i++) {
                System.out.print("Enter the name of your kid number " + (i + 1) + " ");
                names[i] = scanner.nextLine();
            }
            scanner.close();

            System.out.println("Your kids are :" );
            for (int i = 0; i < number; i++) {
                System.out.println(names[i]);

            }
        }
        catch (Exception e) {
            System.out.println("That was not a number. Please type a number!");
        }
    }
}

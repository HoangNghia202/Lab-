/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer_caculator;

import java.util.Scanner;

/**
 *
 * @author Hoang Nghia
 */
public class validation {

    public static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim().toUpperCase();
            if (result.isEmpty()) {
                System.err.println("It must not empty!");
                System.err.println("Try again");
            } else {
                return result;
            }

        }
    }

    public static String checkInputYN() {
        while (true) {
            String choice = validation.checkInputString();
            if (choice.equalsIgnoreCase("N")) {
                return choice;
            } else {
                if (choice.equalsIgnoreCase("Y")) {
                    return choice;
                }
            }
            System.out.println("You must Enter Y/N!");

        }
    }

    static Double checkInputDouble() {
        while (true) {
            try {
                Double result = Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of double.");
                System.out.print("Enter again: ");
            }
        }
    }

    static int checkInputIntLimit(int a, int b) {
        while (true) {
            int num = Integer.parseInt(sc.nextLine().trim());
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.println("Please only " + a + " to " + b);
            }
        }
    }

}

package computer_caculator;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Hoang Nghia
 */
public class Computer_caculator {

    static Scanner sc = new Scanner(System.in);

    public void nomalCaculator() {
        double result = 0;
        System.out.print("Enter number: ");
        result = validation.checkInputDouble();
        double number = 0;
        while (true) {
            System.out.print("Enter operator: ");
            String operator = sc.next();

            sc.nextLine();
            switch (operator) {
                case "+":
                    System.out.print("Enter number: ");
                    number = validation.checkInputDouble();

                    result = result + number;
                    System.out.print("memory: " + result);
                    break;
                case "-":
                    System.out.print("Enter number: ");
                    number = validation.checkInputDouble();
                    result = result - number;
                    System.out.print("memory: " + result);
                    break;
                case "*":
                    System.out.print("Enter number: ");
                    number = validation.checkInputDouble();
                    result = result * number;
                    System.out.print("memory: " + result);
                    break;
                case "/":
                    System.out.print("Enter number: ");
                    number = validation.checkInputDouble();
                    result = result / number;
                    System.out.print("memory: " + result);
                    break;
                case "^":
                    System.out.print("Enter number: ");
                    number = validation.checkInputDouble();
                    result = Math.pow(result, number);
                    System.out.print("memory: " + result);
                    break;
                case "=":
                    System.out.print("result: " + result);
                    return;
                default:
                    System.out.print("Please input (+, -, *, /, ^)");
            }

        }
    }

    public void BMIcalulator() {
        System.out.print("Enter weight(kg): ");
        double w = validation.checkInputDouble();
        System.out.print("Enter heigh(cm): ");
        double h = validation.checkInputDouble();
        h=h/100;
        double result = w / (h * h);
        if (result < 19) {
            System.out.print("under standard");
        } else {
            if (result >= 19 && result <= 25) {
                System.out.print("Standard");
            } else {
                if (result > 25 && result < 30) {
                    System.out.print("Overweight");
                } else {
                    if (result > 30 && result < 40) {
                        System.out.print("Fat - should lose weight");
                    } else {
                        if (result > 40) {
                            System.out.print("Very fat - should lose weight immediately");
                        }
                    }
                }
            }
        }
    }
}

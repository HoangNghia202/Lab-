package computer_caculator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hoang Nghia
 */
public class Menu {
    public static  int menu(){
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.println("\nPlease choice one option: ");
        int choice=validation.checkInputIntLimit(1, 3);
        return  choice;
    }
}

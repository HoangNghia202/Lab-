package Caculator_program;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuItemUI;

public class Menu {
    static Scanner sc= new Scanner(System.in);
        static int menu(){
        System.out.println("============Calculator program===========");
        System.out.println("1. Addition matrix");
        System.out.println("2. Subtraction matrix");
        System.out.println("3. Multiplicaton matrix");
        System.out.println("4. Quit");
        System.out.print("\nEnter your choice: ");
        int chocie= sc.nextInt();
        return chocie;
    }
}

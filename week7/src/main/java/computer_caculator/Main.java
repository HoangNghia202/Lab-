/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer_caculator;

/**
 *
 * @author Hoang Nghia
 */
public class Main {

    public static void main(String[] args) {
        Computer_caculator c = new Computer_caculator();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    c.nomalCaculator();
                    break;
                case 2:
                    c.BMIcalulator();
                    break;
                case 3:
                    return ;
                  
            }
        }

    }
}


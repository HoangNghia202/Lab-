package manageWorkerInfo.Manage;

import javax.sound.midi.Soundbank;

public class Menu {

    public static int  menu(){
        System.out.println("\n================= Worker Management =================");
        System.out.println("1. Add worker");
        System.out.println("2. Up/Down salary");
        System.out.println("3. Display information salary");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice= Validation.checkInputIntLimit(1, 4);
        return choice;

    }
    
}

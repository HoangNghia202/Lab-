package Handing_fractions_program;

import org.w3c.dom.ls.LSException;

import Task_managment.Validation;

public class Main {
    public static void main(String[] args) {
        List_fraction list= new List_fraction();
        System.out.print("enter number: ");
        int num= Validation.checkInputInt();
        list.add(num);
        list.printList();
        list.printSumFraction();
    }
}

package Task_managment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    final static Scanner sc= new Scanner(System.in);
    
    public static String checkInputString(){
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()){
                System.err.println("It must not empty!");
                System.err.println("Try again");
            }else{
                return convertToUpperCase(result);
            }
            
        }
    }
    
    public static String checkInputYN(){
        while (true) {
            String choice=Validation.checkInputString();
            if (choice.equalsIgnoreCase("N")) {
                return choice;
            } else {
                if(choice.equalsIgnoreCase("Y")){
                    return choice;
                }
            }
            System.out.println("You must Enter Y/N!");

        }
    }

    static Double checkInputDouble(){
        while (true) {
            try {
               Double result= Double.parseDouble(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of double.");
                System.out.print("Enter again: ");
            }
        }
    }

    static int checkInputIntLimit(int a, int b){
        while (true) {
            int num= Integer.parseInt(sc.nextLine().trim());
            if (num>=a && num <=b){
                return num;
            }else{
                System.out.println("Please enter form "+a+" to " +b);
            }
        }
    }

    static Double checkInputIntLimitDouble(Double  a, Double b){
        while (true) {
            Double num= checkInputDouble();
            if (num>=a && num <=b){
                return num;
            }else{
                System.out.println("Please enter form "+a+" to " +b);
            }
        }
    }

    public static String convertToUpperCase(String message) {
        // chuyen String thanh mang ki tu
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        for (int i = 0; i < charArray.length; i++) {
            // neu phan tu trong mang la 1 chu cai
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    // doi chu in hoa thanh chu thuong
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        // chuyen mang ki thu thanh string.
        message = String.valueOf(charArray);
        return message;
    }

    public static Date checkInputDate ()throws ParseException{
        while (true) {
            SimpleDateFormat type= new SimpleDateFormat("dd-MM-yyyy");
            try {
               
                Date date= type.parse(sc.nextLine().trim());
                return date;
            } catch (Exception e) {
                System.out.printf("This date invalid or unavailable! Please enter again: "); 
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int i = Integer.parseInt(sc.nextLine().trim());
                return i;
            } catch (NumberFormatException e) {
                System.err.println("It must ba a integer!");
                System.err.println("Enter again: ");
            }
        }
    }
    


}

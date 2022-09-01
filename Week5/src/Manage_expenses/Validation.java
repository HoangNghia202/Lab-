package Manage_expenses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validation {
    public final static Scanner sc = new Scanner(System.in);

    public static String checkInputString(){
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()){
                System.err.println("It must not empty!");
                System.err.println("Try again");
            }else{
                return result;
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

  

    static int checkInputIntLimit(int a, int b){
        while (true) {
            int num= Integer.parseInt(sc.nextLine().trim());
            if (num>=a && num <=b){
                return num;
            }else{
                System.out.println("Please only "+a+" to " +b);
            }
        }
    }

    public static Date checkInputDate ()throws ParseException{
        while (true) {
            SimpleDateFormat type= new SimpleDateFormat("dd-MMM-yyyy");
            try {
               
                Date date= type.parse(sc.nextLine().trim());
                return date;
            } catch (Exception e) {
                System.out.printf("This date invalid or unavailable! Please enter again: "); 
            }
        }
    }

    public static String inputDate() throws ParseException{
         Date date= checkInputDate();
        SimpleDateFormat type= new SimpleDateFormat("dd-MMM-yyyy");
        String strDate= type.format(date);
        return strDate;
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

    static Integer checkInputInteger(){
        while (true) {
            try {
               Integer result= Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of integer.");
                System.out.print("Enter again: ");
            }
        }
    }
   

}

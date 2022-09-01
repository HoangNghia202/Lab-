package Login_account;

import java.util.Scanner;



public class Validation {

    public static String checkInputString(){
        while (true) {
            String result = sc.nextLine().trim().toUpperCase();
            if (result.isEmpty()){
                System.err.println("It must not empty!");
                System.err.println("Try again");
            }else{
                return result;
            }
            
        }
    }
    public final static Scanner sc = new Scanner(System.in);

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

    static String checkInputAcc(){
        String acc;
        while (true) {
            acc= Validation.checkInputString();
            if (acc.matches("\\d{10}")) {
                return acc;
            }else{
                System.out.println("");
            }
        }
        
    }

    

    
}

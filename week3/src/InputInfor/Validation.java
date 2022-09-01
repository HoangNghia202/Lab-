package InputInfor;

import java.util.Scanner;

public class Validation {
    final static Scanner sc= new Scanner(System.in);

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



    public static double checkInputDouble() {
       double i;
        while (true) {

            try {
                System.out.print("Please input salary: ");
                 i = Double.parseDouble(sc.nextLine().trim());
                 if (i<0) {
                     System.out.println("The sallary is greater than 0.");
                 } else{
                     return i;
                 }
            } catch (NumberFormatException e) {
                System.out.println("You must input digit.");
               
            }
        
        }
    }
}

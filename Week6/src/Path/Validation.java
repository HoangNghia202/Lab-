package Path;

import java.util.Scanner;

public class Validation {
    public final static Scanner sc = new Scanner(System.in);

    static int checkInputSize(){
        while (true) {
            try {
               Integer result= Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("size must be digits");
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
                System.out.println("Please only "+a+" to " +b);
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim().toUpperCase();
            if (result.isEmpty()) {
                System.err.println("It must not empty!");
                System.err.println("Try again");
            } else {
                return result;
            }

        }
    }

}
   


package docter_management;


import java.util.Scanner;



public class Validation {
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
    
    public static Scanner sc= new Scanner(System.in);
    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("It must not empty!");
                System.err.println("Try again");
            } else {
                return result;
            }

        }
    }

    public static String checkInputYN() {
        while (true) {
            String choice = Validation.checkInputString();
            if (choice.equalsIgnoreCase("N")) {
                return choice;
            } else {
                if (choice.equalsIgnoreCase("Y")) {
                    return choice;
                }
            }
            System.out.println("You must Enter Y/N!");

        }
    }

    public static String checkInputCode(){
        String codeForm="DOC\\s\\d{1,}";
        while (true) {
            System.out.print("Enter code: ");
            String code= checkInputString();
            code=code.toUpperCase();
            if (code.matches(codeForm)) {
                return code;
            }
            else{
                System.out.println("This Code invalid! ");
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

    static int checkInputIntLimit(int a, int b) {
        while (true) {
            int num = Integer.parseInt(sc.nextLine().trim());
            if (num >= a && num <= b) {
                return num;
            } else {
                System.out.println("Please only " + a + " to " + b);
            }
        }
    }
}

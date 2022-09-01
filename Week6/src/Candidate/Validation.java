package Candidate;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Validation {
    public final static Scanner sc = new Scanner(System.in);

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

    
    public static String checkInputYear() {
        String format = "[0-9]{4}";
        String year;
        LocalDate localDate = LocalDate.now();
        int localYear = localDate.getYear();

        year = Validation.checkInputString();
        if (!year.matches(format)) {
            System.out.println("input failed. Enter again (format: 'xxxx')");
            return checkInputYear();
        }

        if (Integer.parseInt(year) > localYear || Integer.parseInt(year) < 1900) {
            System.out.println("Failed! from 1900 to " + localYear);
            return checkInputYear();
        }
            return year;
        

    }

    public static String checkInputGraduaYear(String birthYear) {
        int bYear= Integer.parseInt(birthYear);
        String format = "[0-9]{4}";
        String year;
        LocalDate localDate = LocalDate.now();
        int localYear = localDate.getYear();

        year = Validation.checkInputString();
        if (!year.matches(format)) {
            System.out.println("input failed. Enter again (format: 'xxxx')");
            return checkInputGraduaYear(birthYear);
        }

        if (Integer.parseInt(year) > localYear || Integer.parseInt(year) < bYear) {
            System.out.println("Failed! from "+bYear+" to "+localYear);
            return checkInputGraduaYear(birthYear);
        }
            return year;
        

    }

    public static String checkInputPhoneNumber() {
        String format = "[0-9]{10,}";
        String numPhone;
        while (true) {
            numPhone = Validation.checkInputString();
            if (!numPhone.matches(format)) {
                System.out.print("Failed! Enter again(minimum 10 digix): ");
            } else {
                return numPhone;
            }
        }
    }

    public static String checkInputEmail() {
        String formatGmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (true) {
            String gmail = sc.nextLine().trim();
            if (gmail.matches(formatGmail)) {
                return gmail;
            } else {
                System.out.println("Email must in correct format");
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

    static int checkInputInt(){
        while (true) {
            try {
               Integer result= Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of double.");
                System.out.print("Enter again: ");
            }
        }
    }

}

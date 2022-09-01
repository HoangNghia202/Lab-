package contact_management;

import java.util.Scanner;

public class Validation {

    public final static Scanner sc = new Scanner(System.in);

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

    public static String checkInputPhoneNumber() {
        while (true) {
            System.out.print("Enter phone: ");
            String phoneNumber = Validation.checkInputString();
            if (phoneNumber.matches("\\d{10}")) {
                return phoneNumber;
            } else {
                if (phoneNumber.matches("^\\d{3}-\\d{3}-\\d{4}$")) {
                    return phoneNumber;
                } else {
                    if (phoneNumber.matches("^\\d{3}-\\d{3}-\\d{4}\\ x\\d{3,}$")) {
                        return phoneNumber;
                    } else {
                        if (phoneNumber.matches("^\\d{3}-\\d{3}-\\d{4}\\ ext\\d{3,}$")) {
                            return phoneNumber;
                        } else {
                            if (phoneNumber.matches("^\\d{3}.\\d{3}.\\d{4}$")) {
                                return phoneNumber;
                            } else {
                                if (phoneNumber.matches("^\\d{3} \\d{3} \\d{4}S")) {
                                    return phoneNumber;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println("Please in put phone follow: ");
            System.out.println("1234567890\n123-456-7890\n123-456-7890 x1234\n123-456-7890 ext1234\n123.456.7890\n123 456 7890");

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


/**
 * Validation
 */
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

    static float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of double.");
                System.out.print("Enter again: ");
            }
        }
    }

    static int checkInputInt()
    {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (Exception e) {
                System.err.println("this must be an type of int.");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double checkInputDouble() {
        double i;
         while (true) {
 
             try {
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

    public Date checkInputDate() throws ParseException {
        while (true) {
            SimpleDateFormat type = new SimpleDateFormat("dd/MM/yyyy");
            try {
                System.out.print("Enter date:");
                Date date = type.parse(sc.nextLine().trim());
                return date;
            } catch (Exception e) {
                System.out.printf("This date invalid or unavailable! Please enter again: ");
            }
        }
    }

    public String checkInputPhoneNumber() {
        final String regex = "^0\\d{9}$";
        while (true) {
            System.out.print("Enter your phone number: ");
            String s = sc.nextLine().trim();
            boolean checkIsNumber = false;
            try {
                int result = Integer.parseInt(s);
                checkIsNumber = true;
            } catch (Exception e) {
                System.out.println("phone musst be a number!");
            }

            boolean checkQuality = false;

            if (checkIsNumber) {
                if (s.length() == 10) {
                    checkQuality = true;
                } else {
                    System.out.println("Phone number must be 10 digits");
                }

            }

            if (checkQuality == true) {
                try {
                    s.matches(regex);
                    return s;
                } catch (Exception e) {
                    System.out.println("Phone number must be begin by '0'");
                }
            }

        }
    }

    public String checkInputEmail() {
        String formatGmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (true) {
            System.out.print("Enter your gmail: ");
            String gmail = sc.nextLine().trim();
            if (gmail.matches(formatGmail)) {
                return gmail;
            } else {
                System.out.println("Email must in correct format");
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

}
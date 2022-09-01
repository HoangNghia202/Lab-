package CheckDataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Main {
    Scanner sc = new Scanner(System.in);
    
    public Date checkInputDate ()throws ParseException{
        while (true) {
            SimpleDateFormat type= new SimpleDateFormat("dd/MM/yyyy");
            try {
                System.out.print("Enter date:");
                Date date= type.parse(sc.nextLine().trim());
                return date;
            } catch (Exception e) {
                System.out.printf("This date invalid or unavailable! Please enter again: "); 
            }
        }
    }


    public String checkInputPhoneNumber(){
        final String regex="^0\\d{9}$";
        while (true) {
            System.out.print("Enter your phone number: ");
            String s= sc.nextLine().trim();
            boolean checkIsNumber= false;
            try {
                int result=Integer.parseInt(s);
                checkIsNumber=true;
            } catch (Exception e) {
               System.out.println("phone musst be a number!");
            }

            boolean checkQuality= false;

            if (checkIsNumber) {
                if(s.length()==10){
                    checkQuality=true;
                 } else{
                     System.out.println("Phone number must be 10 digits");
                 }
     
            }

           
            if (checkQuality==true) {
                try {
                    s.matches(regex);
                    return s;
                } catch (Exception e) {
                    System.out.println("Phone number must be begin by '0'");
                }
            }

          

        }
    }


    public String checkInputEmail(){
        String formatGmail="^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (true) {
            System.out.print("Enter your gmail: ");
            String gmail= sc.nextLine().trim();
            if (gmail.matches(formatGmail)) {
                return gmail;
            } else{
                System.out.println("Email must in correct format");
            }
        }
    }

    public static void main(String[] args) throws ParseException {
        Main input= new Main();
        String phoneNumber = input.checkInputPhoneNumber();
        System.out.println("your phone number is: "+phoneNumber);
        String email= input.checkInputEmail();
        System.out.println("your email is: "+ email);
        Date date= input.checkInputDate();
        System.out.println("Date: "+date);
    }
       
}

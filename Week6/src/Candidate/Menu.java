package Candidate;

public class Menu {
    public static int menu(){
        System.out.println("CANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Intern");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("\nEnter your choice: ");
        int choice= Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}

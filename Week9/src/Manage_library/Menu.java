package Manage_library;

public class Menu {
    public static int menu(){
        System.out.println("======== Library Management=======");
        System.out.println("1. Add document");
        System.out.println("2. Delete document");
        System.out.println("3. View document information");
        System.out.println("4. Update document information");
        System.out.println("5. Exit");
        System.out.println("\nEnter your choice: ");
        int choice= Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}

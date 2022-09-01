package contact_management;

public class Menu {
    public static int menu(){
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a Contact");
        System.out.println("2. Display all contact");
        System.out.println("3. Delete a contact");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice= Validation. checkInputIntLimit(1, 4);
        return choice;
    }
}

package Student_management;

public class Menu {
    public static int menu(){
        System.out.println("===============Student management===============");
        System.out.println("1. create student");
        System.out.println("2. Find and sort student");
        System.out.println("3. Update/Delete student");
        System.out.println("4. Report");
        System.out.println("5. Exit");
        System.out.print("\nEnter your choice: ");
        int choice= Validation.checkInputIntLimit(1, 5);
        return choice;
    }
}

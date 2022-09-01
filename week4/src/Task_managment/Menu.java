package Task_managment;


public class Menu {
    public static int menu(){
        System.out.println("\n========= Task program =========");
        System.out.println("1. Add task");
        System.out.println("2. Delete task");
        System.out.println("3. Display task");
        System.out.println("4. exit");
        System.out.print("\nEnter your choice: ");
        int choice = Validation.checkInputIntLimit(1, 4);
        return choice;

    }
}

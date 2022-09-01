package Manage_expenses;

public class Menu {
    public  static int menu(){
        System.out.println("=======Handy Expense program======");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Delete an expense");
        System.out.println("4. Quit\n");
        System.out.print("Your choice: ");
        int choice= Validation.checkInputInteger();
        return choice;

    }
}

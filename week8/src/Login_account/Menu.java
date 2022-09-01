package Login_account;

public class Menu {
    static int menu(){
        System.out.println(" -------Login Program-------");
        System.out.println("1. Vietnamese");
        System.out.println("2. English");
        System.out.println("3. Exit");
        System.out.println("\nPlease choice one option:");
        int choice= Validation.checkInputIntLimit(1, 3);
        return choice;

        




    }
}

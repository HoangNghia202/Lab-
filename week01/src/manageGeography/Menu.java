package manageGeography;

public class Menu {
    public static int menu(){
        System.out.println( "\t\t\t\t MENU " );
        System.out.println("=========================================================================");
        System.out.println("1. Input the information of countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order ");
        System.out.println("5. Exit");
        System.out.println("=========================================================================");
        int option= Validation.checkInputIntLimit(1, 5);
        return option;
    }
}

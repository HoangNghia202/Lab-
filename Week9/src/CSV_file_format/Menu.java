package CSV_file_format;

import java.util.Scanner;

public class Menu {
    public static int menu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("======= Format CSV Program =======");
        System.out.println("1. Import CSV");
        System.out.println("2. Format Address");
        System.out.println("3. Format Name ");
        System.out.println("4. Export CSV");
        System.out.println("5. Exit");
        System.out.print("\nPlease choice one option:");
        int choice= sc.nextInt();
        return choice;
    }
}

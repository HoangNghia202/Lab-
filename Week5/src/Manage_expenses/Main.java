package Manage_expenses;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        List_expenses list= new List_expenses();
        while (true) {
            int choice= Menu.menu();
            switch (choice) {
                case 1:
                    list.add();
                 break;
                
                case 2:
                    list.display();
                  break;

                case 3:
                    list.remove();
                    break;

                case 4:
                    return;
                  
            
            }
        }
    }
      
}

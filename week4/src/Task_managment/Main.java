package Task_managment;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        ListTask list = new ListTask();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.delete();
    
                    break;
                case 3:
                    list.disPlay();
                    break;
                case 4:
                    return;
             
            }
        }
     
    }

}

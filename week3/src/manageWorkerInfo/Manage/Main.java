package manageWorkerInfo.Manage;

import java.text.ParseException;

public class Main {

   public static void main(String[] args) throws ParseException {
      MangeWorker ls = new MangeWorker();
      while (true) {
         int choice = Menu.menu();
         switch (choice) {
            case 1:
               ls.addWorker();
               break;

            case 2:
               ls.ChangeSalary();
               break;

            case 3:
               ls.displaySalaryHistory();

               break;
            case 4:
               return;
              
         }
      }

   }

}

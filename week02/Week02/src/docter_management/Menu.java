package docter_management;

public class Menu {
   public static int menu(){
       System.out.println("========= Doctor Management ==========");
       System.out.println("1. Add doctor");
       System.out.println("2. Update doctor");
       System.out.println("3. Delete Doctor");
       System.out.println("4. View all doctor information ");
       System.out.println("5. Exit");
       System.out.print("=================================\nEnter your choice:");
       int choice= Validation.checkInputIntLimit(1, 5);
      
       return choice;
   } 
}

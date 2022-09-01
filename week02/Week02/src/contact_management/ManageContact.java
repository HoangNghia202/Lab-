package contact_management;

import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;

public class ManageContact {
    List<ContactInformation> ls= new Vector<>();

    public ManageContact() {
    }

    public ManageContact(List<ContactInformation> ls) {
        this.ls = ls;
    }

    public void add(){
        while (true) {
            System.out.print("Enter name to add: ");
            String fullName= Validation.checkInputString();
            fullName = Validation.convertToUpperCase(fullName);
            StringTokenizer stk = new StringTokenizer(fullName, " ");
            String firstName;
            String lastName;
            while (stk.hasMoreTokens()) {
                 firstName= stk.nextToken();
                 lastName= stk.nextToken();

                 System.out.print("Enter group: ");
                 String group= Validation.checkInputString();
                 System.out.print("Enter address: ");
                 String addr= Validation.checkInputString();
                 addr=Validation.convertToUpperCase(addr);
                 String phoneNum=Validation.checkInputPhoneNumber();
                 ls.add(new ContactInformation(ls.size()+1, fullName, firstName, lastName, group, addr, phoneNum));
                 System.out.println("Add successfully");
                 System.out.println("Do you want to continue (Y/N)");
                 String choice= Validation.checkInputYN();
                 if (choice.equalsIgnoreCase("N")) {
                     return;
                 }
            }
           
        }
    }

    public int findIdContact(int id){
        for (int i = 0; i < ls.size(); i++) {
            if(id==ls.get(i).getId()){
                return i;
            }
        }
        return -1;

    }

    public void delete(){
        System.out.print("Enter id you want to delete: ");
        int id = Validation.checkInputInt();
        int result= findIdContact(id);
        if (result>=0) {
            ls.remove(ls.get(result));
            System.out.println(" Delete Successfully");
        } else{
            System.out.println("This id not exist. Can't delete.");
        }
    }

    public void displayAll(){
        if (ls.isEmpty()) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.println("IDName\t\tFull Name\t\tFirst Name\t\tLastName\t\tGroup\t\tAddress\t\tPhone");
        for (ContactInformation o : ls) {
           System.out.println(o);
        }
    }


    
}

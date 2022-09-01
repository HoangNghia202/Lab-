package docter_management;

import java.util.List;
import java.util.Vector;

public class Management {
    List <DoctorInfor> ls= new Vector<>();

    public int findCode(String code){
        for (int i = 0; i < ls.size(); i++) {
            if (code.equalsIgnoreCase(ls.get(i).getCode())) {
                return i;
            }
        }
        return -1;
    }

    public void add(){
        while (true) {
            System.out.println("--------- Add Doctor ----------");
            System.out.println("Enter ID doctor: ");
            String code= Validation.checkInputCode();
            if (findCode(code)<=0) {
                System.out.print("Enter name: ");
                String name= Validation.checkInputString();
                name=Validation.convertToUpperCase(name);
                System.out.print("Enter specialization: ");
                String spec= Validation.checkInputString();
                System.out.print("Enter availability: ");
                int avail= Validation.checkInputInt();
                ls.add(new DoctorInfor(code, name, spec, avail));
            }    
            System.out.print("Do you want to continue(Y/N)?: ");
            String choice= Validation.checkInputYN();
            if (choice.equalsIgnoreCase("N")) {
                return;
            }
        }
     
    }

    public void update(){
        while (true) {
            System.out.println("--------- Update Doctor -------");
            System.out.print("Enter code to update: ");
            String code= Validation.checkInputCode();
            int index= findCode(code);
            if (index>=0) {
                System.out.print("Enter name to update: ");
                String name= Validation.checkInputString();
                System.out.print("Enter Specialization to update: ");
                String spe= Validation.checkInputString();
                System.out.print("Enter availability to update: ");
                int avail= Validation.checkInputInt();
                ls.set(index, new DoctorInfor(code, name, spe, avail));
                System.out.println("Update successfully");
            }else{
                System.out.println("The code not exist. Can not update!");
            }

            System.out.println("Do you want to continue(Y/N): ");
            String choice = Validation.checkInputYN();
            if (choice.equalsIgnoreCase("N")) {
                return;
            }
        }
    }

    public void delete(){
        System.out.println("--------- Delete Doctor -------");
        System.out.print("Enter code to delete: ");
        String code= Validation.checkInputCode();
        int index= findCode(code);
        if(index>=0){
            ls.remove(index);
            System.out.println("Delete successfully");
        } else{
            System.out.println("The code not exist. Can not delete");
        }
    }

    public void displayAll(){
        System.out.println("Code\tName\tSpecialization\tAvailability");
        for (DoctorInfor doctorInfor : ls) {
            System.out.println(doctorInfor);
        }
    }


}

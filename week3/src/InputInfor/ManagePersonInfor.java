package InputInfor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagePersonInfor {
    
    public ManagePersonInfor() {
    }

    List<Person>ls= new ArrayList<>();
    

    
    

    public void add(){
       
        for (int i = 0; i < 3; i++) {
            System.out.print("Please input name: ");
            String name= Validation.checkInputString();
            System.out.print("Please input address: ");
            String address= Validation.checkInputString();
            double salary= Validation.checkInputDouble();
            ls.add(new Person(name, address, salary));

        }
    }

    public void display(){
         Collections.sort(ls, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                return o1.getSalary().compareTo(o2.getSalary());
            }
             
         });

         System.out.println("Information of Person you have entered: ");

         for (Person person : ls) {
             System.out.println(person);
         }

    }
}

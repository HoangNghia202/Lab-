package manageGeography;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManageEastAsiaCountries {
    List <EastAsianCountry> ls = new ArrayList<>();

    private int findBycode( String code){
        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getCountryCode().equalsIgnoreCase(code) ) {
                return i;
            }
        }
        return -1;
    }

    public void enterCountry(){
         while (true) {
             System.out.print("Enter country code: ");
             String code = Validation.checkInputString();
             if (findBycode(code)==-1) {
                 System.out.print("Enter country name: ");
                 String name= Validation.checkInputString();
                 System.out.print("Enter total area: ");
                 float area= Validation.checkInputFloat();
                 System.out.print("Enter terrain: ");
                 String terrain= Validation.checkInputString();
                 ls.add(new EastAsianCountry(code, name, area, terrain));
             } else{
                 System.out.println(" Country code duplicated! Can not add.");
             }

             System.out.print("Do you want to countinue enter? (Y/N)");
             String choice = Validation.checkInputYN();
             if (choice.equalsIgnoreCase("N")) {
                 return;
             }
         }
    }


    public void displayLastCountry(){
        if(ls.isEmpty()){
            System.out.println("List is empty");
        } else{
            for (int i = 0; i < ls.size(); i++) {
                if(i==ls.size()-1){
                    System.out.println(ls.get(i));
                }
            }
        }
    }

    public int searchCountryByName(String name){
       for (int i = 0; i < ls.size(); i++) {
           if (name.equalsIgnoreCase(ls.get(i).getCountryName())) {
               return i;
           }
       }
       return -1;
    }

    public void displayCountryByName(){
        System.out.print("Enter counrtry name: ");
        String name= Validation.checkInputString();
        if (searchCountryByName(name)!=-1) {
            System.out.println(ls.get(searchCountryByName(name)));
        } else{
            System.out.println("Name doesn't exist");
        }
    }

    public void sortAccendingName(){
        Collections.sort(ls, new Comparator<EastAsianCountry>() {

            @Override
            public int compare(EastAsianCountry o1, EastAsianCountry o2) {
               
                return o1.getCountryName().compareTo(o2.getCountryName());
            }
            
        });
        for (EastAsianCountry o : ls) {
            System.out.println(o);
        }
    }


}


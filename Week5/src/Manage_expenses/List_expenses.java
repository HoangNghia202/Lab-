package Manage_expenses;

import java.text.ParseException;
import java.util.ArrayList;

public class List_expenses {
    ArrayList <Expenses> ls= new ArrayList<>();

    private int findID( int ID){
        for (int i = 0; i < ls.size(); i++) {
            if (ID==ls.get(i).getID()) {
                return i;
            }
        }
        return -1;
    }

    public void add() throws ParseException{
       System.out.print("Enter Date: ");
       String date= Validation.inputDate();
       System.out.print("Enter amount of money: ");
       double money= Validation.checkInputDouble();
       System.out.print("Enter content: ");
       String content =Validation.checkInputString();

       Expenses newExp= new Expenses();
       if (ls.isEmpty()) {
           newExp.setID(1);
           newExp.setDate(date);
           newExp.setNumber(money);
           newExp.setContent(content);
           ls.add(newExp);
           System.out.println("Add successful ");
       } else{
        int lastID= ls.get(ls.size()-1).getID();
        newExp.setID(lastID+1);
        newExp.setDate(date);
        newExp.setNumber(money);
        newExp.setContent(content);
        ls.add(newExp);
       }
    }

    public void display(){
        System.out.printf("%-10s %-20s %-20s %-20s\n","ID","Date","Amount of money", "Content");
        double total=0;
        for (Expenses e : ls) {
            total=total+e.getNumber();
            System.out.printf("%-10s %-20s %-20s %-20s\n",e.getID(), e.getDate(), e.getNumber(),e.getContent());
        }
        System.out.println("               Total:             "+total);
    }

    public void remove(){
        System.out.print("Enter ID to removed: ");
        int ID= Validation.checkInputInteger();
        int result = findID(ID);
        if (result>=0) {
            ls.remove(result);
            System.out.println("Delete an expense successful");
        } else{
            System.out.println("Delete an expense fail");
        }
    }
}

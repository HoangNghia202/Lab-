package Task_managment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class ListTask {
    List<Task> ls = new ArrayList<>();

    public int findId(int id) {
       for (int i = 0; i < ls.size(); i++) {
           if (id==ls.get(i).getId()) {
               return i;
           }
       }
        return -1;
    }

    private String taskTypeOption() {
        String taskType="";
        System.out.printf("%-5s%s","ID", "Name");
        System.out.printf("\n%-5d%s\n%-5d%s\n%-5d%s\n%-5d%s\n",1,"Code",2,"Test",3,"Design",4,"Review");
      
        int choice;
        System.out.print("Task type: ");
        choice=Validation.checkInputIntLimit(1, 4);
        switch (choice) {
            case 1:
                taskType="Code";    
                break;
            case 2:
                taskType="Test";
                break;
            case 3:
                taskType="Design";
                break;
            case 4:
                taskType="Review";
                break;
           
        }
        return taskType;
    }

    private double enterFrom(){
        double from;
       do {
           System.out.print("From: ");
           from= Validation.checkInputIntLimitDouble(8.0, 17.0);
       } while ((from*10)%5!=0 );
       return from;
    }

    private double enterTo(){
        double to;
       do {
           System.out.print("To: ");
           to= Validation.checkInputIntLimitDouble(8.0, 17.0);
       } while ((to*10)%5!=0 );
       return to;
    }
    
    

    public void add() throws ParseException {
        System.out.println("---------------Add Task---------------");
        while (true) {
            System.out.print("Requirement Name: ");
            String reqName = Validation.checkInputString();
        
            String taskType=taskTypeOption();
            System.out.print("Date: ");
            Date date= Validation.checkInputDate();
            double from;
            double to;
            do {
              from=enterFrom();
              to=enterTo();
              if(from>to){
                  System.out.println("From must be less than To! Enter again.");
              }
            } while (from>to);
            
            System.out.print("Assignee: ");
            String ass=Validation.checkInputString();

            System.out.print("Reviewer: ");
            String rev=Validation.checkInputString();

            if (ls.isEmpty()) {
                ls.add(new Task(ls.size()+1, reqName, taskType, date, from, to, ass , rev));
            }else{
                int id=ls.get(ls.size()-1).getId();
                ls.add(new Task(id+1,reqName, taskType, date, from, to, ass , rev ));
            }

           
            System.out.print("Do you want to continue: ");
            String choice=Validation.checkInputYN();
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Add successful");
                return;
            }
            

        }
    }

    public void delete(){
        System.out.print("ID: ");
        int id= Validation.checkInputInt();
        int result=findId(id);
        if (result==-1) {
            System.out.println("Can not find id!");
            return;
        } else{
            ls.remove(ls.get(result));
            System.out.println("Delete successful");
        }
    }

    public void disPlay(){
        System.out.printf("\n--------------------------------------------------- Task -------------------------------------------------");
        System.out.printf("\n%-15s%-20s%-15s%-20s%-15s%-15s","ID","Task Type", "Date", "Time", "Assignee", "Reviewer");
        SimpleDateFormat type= new SimpleDateFormat("dd-MM-yyyy");
        for (Task task : ls) {
            String date= type.format(task.date);
            System.out.printf("\n%-15s%-20s%-15s%-20s%-15s%-15s",task.id,task.taskType, date, task.from, task.assignee, task.reviewer);
        }

    }

}

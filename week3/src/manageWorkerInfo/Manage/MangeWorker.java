package manageWorkerInfo.Manage;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangeWorker {
    List<Worker> wls = new ArrayList<>();

    public int findID(String id) {
        for (int i = 0; i < wls.size(); i++) {
            if (id.equalsIgnoreCase(wls.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public void addWorker() throws ParseException {
        while (true) {
            System.out.println("-----------------ADD WORKER------------------");
            String id = Validation.checkInputCode();
            if (findID(id) >= 0) {
                System.out.println("Id duplicated");
                System.out.print(" Do you want to continue? (Y/N): ");
                return;
            } else{
                System.out.print("Enter worker name: ");
                String name = Validation.checkInputString();
                name = Validation.convertToUpperCase(name);
                System.out.print("Enter age: ");
                int age = Validation.checkInputIntLimit(18, 50);
                System.out.print("Enter salary: ");
                double salary = Validation.checkInputDouble();
                System.out.print("Enter work location: ");
                String workLoca = Validation.checkInputString();
    
                Worker worker = new Worker();
                worker.setId(id);
                worker.setName(name);
                worker.setWorkLocation(workLoca);
                worker.setAge(age);
                worker.setSalary(salary);
    
                SalaryHistory salaryHistory = new SalaryHistory();
                Date date = Validation.checkInputDate();
                salaryHistory.setDateChange(date);
                salaryHistory.setStatus("-");
                salaryHistory.setNewSalary(salary);
                worker.salaryHistories.add(salaryHistory);
    
                wls.add(worker);
                System.out.println("\nAdd successfully");
    
                System.out.print(" Do you want to continue? (Y/N): ");
                String choice = Validation.checkInputYN();
                if (choice.equalsIgnoreCase("N")) {
                    return;
                }
            }
          

        }
    }

    public boolean ChangeSalary() throws ParseException {
        System.out.println("-----------------CHANGE SALARY------------------");
        String id = Validation.checkInputCode();
        int index = findID(id);
        if (index >=0) {
            System.out.print("Enter status (Up/Down): ");
            String status = Validation.checkInputString();
            System.out.print("Enter amount:");
            Double amount = Validation.checkInputDouble();
            if (status.equalsIgnoreCase("up")) {
                wls.get(index).setSalary(wls.get(index).getSalary() + amount);

                SalaryHistory salaryHistory = new SalaryHistory();
                Date dateChange = Validation.checkInputDate();
                salaryHistory.setDateChange(dateChange);
                salaryHistory.setStatus("UP");
                salaryHistory.setNewSalary(wls.get(index).getSalary());
                wls.get(index).getSalaryHistories().add(salaryHistory);
                return true;
            } else {
                if (status.equalsIgnoreCase("down")) {
                    wls.get(index).setSalary(wls.get(index).getSalary() - amount);

                    SalaryHistory salaryHistory = new SalaryHistory();
                    Date dateChange = Validation.checkInputDate();
                    salaryHistory.setDateChange(dateChange);
                    salaryHistory.setStatus("DOWN");
                    salaryHistory.setNewSalary(wls.get(index).getSalary());
                    wls.get(index).getSalaryHistories().add(salaryHistory);
                    return true;
                }
            }
        } else{
            System.out.println("Id not exist!");
        }
        return false;
    }

    public void displaySalaryHistory() {
        if (wls.isEmpty()) {
            System.out.println("Empty worker list!");
            return;
        }
        Collections.sort(wls, new Comparator<Worker>() {

            @Override
            public int compare(Worker o1, Worker o2) {
                // TODO Auto-generated method stub
                return o1.getId().compareTo(o2.getId());
            }

        });

        System.out.println("\n---------------------------Display information salary-------------------------");
        System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%-15s", "ID", "Name", "Age", "Salary", "Status", "Date");
        System.out.println();
        for (Worker worker : wls) {
            if (worker.getSalaryHistories().size() > 1) {
                List<SalaryHistory> ls = worker.getSalaryHistories();
                for (SalaryHistory saLs : ls) {
                    if (!saLs.getStatus().equalsIgnoreCase("-")) {
                        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
                        String date = sf.format(saLs.getDateChange());
                        System.out.printf("\n%-15s%-15s%-15s%-15s%-15s%-15s", worker.getId(), worker.getName(),
                                worker.getAge(),
                                saLs.getNewSalary(), saLs.getStatus(), date);
                    }
                }

            }

        }

    }

}

package manageWorkerInfo.Manage;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    protected String id;
    protected String name;
    protected String workLocation;
    protected int age;
    protected double salary;
    List<SalaryHistory> salaryHistories= new ArrayList<>();
    public Worker() {
    }
    public Worker(String id, String name, String workLocation, int age, double salary,
            List<SalaryHistory> salaryHistories) {
        this.id = id;
        this.name = name;
        this.workLocation = workLocation;
        this.age = age;
        this.salary = salary;
        this.salaryHistories = salaryHistories;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getWorkLocation() {
        return workLocation;
    }
    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public List<SalaryHistory> getSalaryHistories() {
        return salaryHistories;
    }
    public void setSalaryHistories(List<SalaryHistory> salaryHistories) {
        this.salaryHistories = salaryHistories;
    }

    public void addHistory(SalaryHistory newSalaryHistory){
        salaryHistories.add(newSalaryHistory);
    }
    @Override
    public String toString() {
        return "Worker [age=" + age + ", id=" + id + ", name=" + name + ", salary=" + salary + ", salaryHistories="
                + salaryHistories + ", workLocation=" + workLocation + "]";
    }

   

    
}

package manageWorkerInfo.Manage;

import java.util.Date;

public class SalaryHistory {
    public Date dateChange;
    public String status;
    public double newSalary;

    public SalaryHistory() {
    }
    public SalaryHistory(Date dateChange, String status, double newSalary) {
        this.dateChange = dateChange;
        this.status = status;
        this.newSalary = newSalary;
    }
    public Date getDateChange() {
        return dateChange;
    }
    public void setDateChange(Date dateChange) {
        this.dateChange = dateChange;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public double getNewSalary() {
        return newSalary;
    }
    public void setNewSalary(double newSalary) {
        this.newSalary = newSalary;
    }

    
}

package Task_managment;

import java.util.Date;

public class Task {
    public int id;
    public String name;
    public String taskType;
    public Date date;
    public double from;
    public double to;
    public String assignee;
    public String reviewer;
    public Task() {
    }
    public Task(int id,String name, String taskType, Date date, double from, double to, String assignee, String reviewer) {
        this.id= id;
        this.name = name;
        this.taskType = taskType;
        this.date = date;
        this.from = from;
        this.to = to;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTaskType() {
        return taskType;
    }
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public double getFrom() {
        return from;
    }
    public void setFrom(double from) {
        this.from = from;
    }
    public double getTo() {
        return to;
    }
    public void setTo(double to) {
        this.to = to;
    }
    public String getAssignee() {
        return assignee;
    }
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public String getReviewer() {
        return reviewer;
    }
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
   
    

    

    
    
}

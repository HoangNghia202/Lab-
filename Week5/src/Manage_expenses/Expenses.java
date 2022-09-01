package Manage_expenses;

public class Expenses {
    public int ID;
    public String date;
    public double number;
    public String content;
    public Expenses(int iD, String date, double number, String content) {
        ID = iD;
        this.date = date;
        this.number = number;
        this.content = content;
    }
    public Expenses() {
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getNumber() {
        return number;
    }
    public void setNumber(double number) {
        this.number = number;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    
}

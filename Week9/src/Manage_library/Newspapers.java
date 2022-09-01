package Manage_library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Newspapers extends Document{
    public Date issueDate;

    public Newspapers() {
    }

    public Newspapers(String documentID, String publisherName,String issueNumber, Date issueDate) {
        super(documentID, publisherName, issueNumber);
        this.issueDate = issueDate;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public void update() throws ParseException{
        super.update();
        System.out.println("Enter issue date: ");
        Date newIssueDay= Validation.checkInputDate();
        this.setIssueDate(newIssueDay);
    }


    
    @Override
    public String toString() {
        SimpleDateFormat type= new SimpleDateFormat("dd-MM-yyyy");
        String date= type.format(issueDate);
        return super.toString()+date;
    }
}

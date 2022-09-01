package Manage_library;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journals extends Document {
    public Date issueMoth;

    public Journals() {
    }

    public Journals(String documentID, String publisherName, String issueNumber, Date issueMoth) {
        super(documentID, publisherName, issueNumber);
        this.issueMoth = issueMoth;
    }

    

    public Date getIssueMoth() {
        return issueMoth;
    }

    public void setIssueMoth(Date issueMoth) {
        this.issueMoth = issueMoth;
    }

    @Override
    public String toString() {
        SimpleDateFormat type= new SimpleDateFormat("MM-yyyy");
        String moth= type.format(issueMoth);
        return super.toString()+ moth;
    }
    public void update() throws ParseException{
        super.update();
        System.out.println("Enter new issue moth");
        try {
            Date newIssuemoth= Validation.checkInputMoth();
            this.setIssueMoth(newIssuemoth);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

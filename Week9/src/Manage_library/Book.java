package Manage_library;

import java.text.ParseException;

public class Book extends Document {
    public String authorName;
    public int pageNumber;
    public Book() {
    }
    public Book(String documentID, String publisherName, String issueNumber, String authorName, int pageNumber) {
        super(documentID, publisherName, issueNumber);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public int getPageNumber() {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
    
        return super.toString()+authorName+" | "+pageNumber;
    }

    public void update() throws ParseException{
        super.update();
        System.out.println("Enter new author name: ");
        String newAthName= Validation.checkInputString();
        newAthName= Validation.convertToUpperCase(newAthName);
        System.out.println("Enter new page number: ");
        int newPageNum= Validation.checkInputInt();
        this.setAuthorName(newAthName);
        this.setPageNumber(newPageNum);
    }

    
 

}

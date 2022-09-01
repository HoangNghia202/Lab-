package Manage_library;

import java.text.ParseException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthToolTipUI;

/**
 * Document
 */
public class Document {


    protected  String documentID;
    protected   String publisherName ;
    protected String issueNumber;
    public Document() {
    }
    public Document(String documentID, String publisherName, String issueNumber) {
        this.documentID = documentID;
        this.publisherName = publisherName;
        this.issueNumber = issueNumber;
    }
    public String getDocumentID() {
        return documentID;
    }
    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }
    public String getPublisherName() {
        return publisherName;
    }
    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    public String getIssueNumber() {
        return issueNumber;
    }
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return documentID+" | "+ publisherName+" | "+ issueNumber+" | ";
    }

    public void update() throws ParseException{
        System.out.println("Enter new document ID:");
        String docID= Validation.checkInputString().toUpperCase();
        this.setDocumentID(docID);
        System.out.println("Enter new publisher name: ");
        String pubName= Validation.checkInputString();
        pubName=Validation.convertToUpperCase(pubName);
        this.setPublisherName(pubName);
        System.out.println("Enter new issue Number: ");
        String issNum= Validation.checkInputString().trim().toUpperCase();
        this.setIssueNumber(issNum);

    }

}
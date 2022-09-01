package Manage_library;

import java.util.Date;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manage {
    List<Document> list = new ArrayList<>();

    private int checkType() {
        int type;
        System.out.println("Please enter 1 to create Books, 2 to create Magazines, 3 to create Newspapers");
        System.out.println("your choice");
        type = Validation.checkInputInt();
        return type;
    }

    public int existID(String ID) {
        if (list.isEmpty()) {
            return -1;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getDocumentID().equalsIgnoreCase(ID)) {
                    return i;
                }

            }
        }
        return -1;
    }

    public void addDocument() throws ParseException {
        System.out.println("--------- Add document --------");
        int key = checkType();
        String documentID = "";
        do {
            System.out.println("Enter document ID: ");
            documentID = Validation.checkInputString().toUpperCase();
            if (existID(documentID) != -1) {
                System.out.println("Document ID existed. Enter again!");
            }
        } while (existID(documentID) != -1);
        System.out.println("Enter publisher Name: ");
        String publisherName = Validation.checkInputString();
        publisherName = Validation.convertToUpperCase(publisherName);
        System.out.println("Enter issue number :");
        String issueNumber = Validation.checkInputString().toUpperCase();

        switch (key) {
            case 1:
                System.out.println("Enter author name: ");
                String authorName = Validation.checkInputString();
                authorName = Validation.convertToUpperCase(authorName);
                System.out.println("Enter page number : ");
                int pageNumber = Validation.checkInputInt();
                Document doc = new Book(documentID, publisherName, issueNumber, authorName, pageNumber);
                list.add(doc);
                break;
            case 2:
                System.out.println("Enter issue moth: ");
                Date issueMoth=Validation.checkInputMoth() ;
                Document docJour = new Journals(documentID, publisherName, issueNumber, issueMoth);
                list.add(docJour);
                break;
            case 3:
                System.out.println("Enter issue date: ");
                Date issueDate=Validation.checkInputDate();
                Document docNewSp= new Newspapers(documentID, publisherName, issueNumber, issueDate);
                list.add(docNewSp);
                break;

            default:
                break;
        }
    }

    public void deleteDocument() {
        System.out.println("------- Delete document--------");
        System.out.println("\nEnter document ID to delete");
        String doID = Validation.checkInputString();
        if (existID(doID) != -1) {
            list.remove(list.get(existID(doID)));
            System.out.println("remove successful");
        } else {
            System.out.println("Not found");
        }
    }

    public  void viewDocumentInfo() {
        System.out.println("--------------------Display Document Information------------------- ");
        Collections.sort(list, new Comparator<Document>() {

            @Override
            public int compare(Document o1, Document o2) {
               return o1.getPublisherName().compareTo(o2.getPublisherName());
                
            }
        });
        for (Document document : list) {
            System.out.println(document.toString());
        }


    }

    public void updateDocument() throws ParseException{
        System.out.println("Enter document ID to update: ");
        String ID= Validation.checkInputString();
        if (existID(ID)==-1) {
            System.out.println("not found!");
            return;
        }
   
        for (Document document : list) {
            if (document.getDocumentID().equalsIgnoreCase(ID)) {
                document.update();
            }
        }

    }

}

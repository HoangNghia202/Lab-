package Manage_library;


import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Manage mn = new Manage();

        while (true) {
            int chocie = Menu.menu();
            switch (chocie) {
                case 1:
                    mn.addDocument();
                    break;
                case 2:
                    mn.deleteDocument();
                    break;
                case 3:
                    mn.viewDocumentInfo();
                    break;
                case 4:
                    mn.updateDocument();
                    break;
                case 5:
                    return;

            }
        }

    }
}

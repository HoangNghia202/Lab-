package CSV_file_format;


public class Main {

    public static void main(String[] args) {

        Format f = new Format();
       
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    f.importFile();
                    break;
                case 2:
                    f.formatAddress();
                    break;

                case 3:
                    f.formatName();
                    break;

                case 4:
                    f.exportCSV();
                    break;
                case 5:
                    return;
                

                default:
                System.out.println("Enter 1-5");
                    break;
            }
        }
    }
}


//E:\\code\\Java\\Java_Lab\\Week9\\src\\CSV_file_format\\import.csv
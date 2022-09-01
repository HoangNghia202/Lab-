package contact_management;

public class Main {
    public static void main(String[] args) {
        ManageContact lsCont = new ManageContact();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    lsCont.add();
                    break;
                case 2:
                    lsCont.displayAll();
                    break;
                case 3:
                    lsCont.delete();
                    break;
                case 4:
                    return;

                default:
                    break;
            }
        }
    }
}

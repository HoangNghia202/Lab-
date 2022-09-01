package docter_management;

public class Main {
    public static void main(String[] args) {
        Management ls = new Management();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    ls.add();
                    break;
                case 2:
                    ls.update();
                    break;
                case 3:
                    ls.delete();
                    break;
                case 4:
                    ls.displayAll();
                    break;
                case 5:
                    return;

                default:
                    break;
            }
        }
    }
}

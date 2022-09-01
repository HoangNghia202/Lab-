package Login_account;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        LoginProgram n = new LoginProgram();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    n.login("Vi");
                    break;

                case 2:
                n.login("En");
                    break;

                case 3:
                    return;
                

            }
        }
    }
}
package manageGeography;


public class Main {
    public static void main(String[] args) {
        ManageEastAsiaCountries ls = new ManageEastAsiaCountries();
        while (true) {
            int option = Menu.menu();
            switch (option) {
                case 1:
                    ls.enterCountry();
                    break;
                case 2:
                    ls.displayLastCountry();
                    break;
                case 3:
                    ls.displayCountryByName();
                    break;
                case 4:
                    ls.sortAccendingName();
                    break;
                case 5:
                    return;
                    

                default:
                    break;
            }
        }
    }
}

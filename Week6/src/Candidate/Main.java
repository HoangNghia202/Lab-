package Candidate;

public class Main {
    public static void main(String[] args) {
        listCandidate ls = new listCandidate();
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    ls.create(1);
                    break;
                case 2:
                    ls.create(2);
                    break;
                case 3:
                    ls.create(3);
                    break;
                case 4:
                    ls.search();
                    break;
                case 5:
                    return;
                    

               
            }
        }
    }
}
//"E:\\Học kì FALL_2021\\SSG104\\FKTK video 01.docx"
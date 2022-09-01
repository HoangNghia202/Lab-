package Student_management;

public class Main {
    public static void main(String[] args) {
        ListStudent students= new ListStudent();
        students.ls.add(new Student("1", "Nguyen Van A", "1", "java"));
        students.ls.add(new Student("1", "Nguyen Van A", "1", "java"));
        students.ls.add(new Student("1", "Nguyen Van A", "1", ".net"));
       
        students.ls.add(new Student("2", "Nguyen Van Hoang", "1", "c/c++"));
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    students.create();
                    break;
                case 2:
                    students.findAndSort();
                    break;
                case 3:
                    students.updateOrDelete();
                    break;
                case 4:
                    students.report();
                    break;
                case 5:
                    return;
            }
        }
    }
}

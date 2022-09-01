package Student_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class ListStudent {
    ArrayList<Student> ls = new ArrayList<>();

    int findID(String ID) {
        for (int i = 0; i < ls.size(); i++) {
            if (ID.equalsIgnoreCase(ls.get(i).getID())) {
                return i;
            }
        }
        return -1;
    }

    String enterCourse() {
        while (true) {
            String courseName = Validation.checkInputString();
            if (courseName.equalsIgnoreCase("Java")) {
                return "Java";
            } else {
                if (courseName.equalsIgnoreCase(".Net")) {
                    return ".Net";
                } else {
                    if (courseName.equalsIgnoreCase("C/C++")) {
                        return "C/C++";
                    }
                }
            }
            System.out.println("Invalid course name!\nEnter again: ");
        }

    }

    public void create() {
        while (true) {
            int count = 0;
            while (count < 3) {
                System.out.print("Enter ID: ");
                String ID = Validation.checkInputString();
                if (findID(ID) != -1) {
                    int index = findID(ID);
                    System.out.println("Student name match with the ID: " + ls.get(index).getStName());
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter course name: ");
                    String courseName = enterCourse();
                    Student newSt = new Student(ID, ls.get(index).getStName(), semester, courseName);
                    count++;
                    ls.add(newSt);

                } else {
                    System.out.print("Enter student name: ");
                    String StName = Validation.checkInputString();
                    StName = Validation.convertToUpperCase(StName);
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter course name: ");
                    String courseName = enterCourse();
                    Student newSt = new Student(ID, StName, semester, courseName);
                    count++;
                    ls.add(newSt);
                }
            }

            do {
                System.out.println("Do you want to continue add?(Y/N): ");
                String checkYN = Validation.checkInputYN();
                if (checkYN.equalsIgnoreCase("n")) {
                    return;
                }
                System.out.print("Enter ID: ");
                String ID = Validation.checkInputString();
                if (findID(ID) != -1) {
                    int index = findID(ID);
                    System.out.println("Student name match with the ID: " + ls.get(index).getStName());
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter course name: ");
                    String courseName = enterCourse();
                    Student newSt = new Student(ID, ls.get(index).getStName(), semester, courseName);
                    ls.add(newSt);
                } else {
                    System.out.print("Enter student name: ");
                    String StName = Validation.checkInputString();
                    StName = Validation.convertToUpperCase(StName);
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter course name: ");
                    String courseName = enterCourse();
                    Student newSt = new Student(ID, StName, semester, courseName);
                    ls.add(newSt);
                }

            } while (true);

        }

    }

    public void findAndSort() {
        ArrayList<Student> subList = new ArrayList<>();
        System.out.print("Enter student's name to find: ");
        String name = Validation.checkInputString().toLowerCase().trim();

        for (Student student : ls) {
            String s = student.getStName().toLowerCase();
            if (s.contains(name)) {
                subList.add(student);
            }
        }

        if (!subList.isEmpty()) {
            Collections.sort(subList, new Comparator<Student>() {

                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getStName().compareTo(o2.getStName());
                }

            });
            System.out.printf("%-15s%-20s%-15s%-15s\n", "ID", "Student name", "Semester", "Course name");
            for (Student student : subList) {
                System.out.printf("%-15s%-20s%-15s%-15s\n", student.getID(), student.getStName(), student.getSemester(),
                        student.getCourseName());
            }

        }
    }

    private String checkInputUD() {
        while (true) {
            String choice;
            choice = Validation.checkInputString();
            if (choice.equalsIgnoreCase("U")) {

                return choice;
            } else {
                if (choice.equalsIgnoreCase("D")) {

                    return choice;
                }
            }
            System.out.println("You must Enter U/D!");
        }
    }

   
    public void updateOrDelete() {
        System.out.print("You want update (U) or Delete(D): ");
        String choice = checkInputUD();
        if (choice.equalsIgnoreCase("U")) {
            ArrayList<Student> udList = new ArrayList<>();
            ArrayList<Integer> position = new ArrayList<>();
            System.out.print("Enter ID to update: ");
            String ID = Validation.checkInputString();
            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i).getID().equalsIgnoreCase(ID)) {
                    udList.add(ls.get(i));
                    position.add(i);
                }
            }
            if (!udList.isEmpty()) {
                System.out.printf("%-15s%-20s%-15s%-15s\n", "Position", "Name", "Semester", "Course");
                for (int i = 0; i < udList.size(); i++) {
                    System.out.printf("%-15s%-20s%-15s%-15s\n", i, udList.get(i).getStName(),
                            udList.get(i).getSemester(), udList.get(i).getCourseName());
                }
                System.out.print("Do you want to change name of this student(Y/N): ");
                String changeName = Validation.checkInputYN();
                if (changeName.equalsIgnoreCase("Y")) {
                    String oldName = udList.get(0).getStName();
                    String stID = udList.get(0).getID();

                    System.out.print("Enter new student's name: ");
                    String newName = Validation.checkInputString();
                    newName = Validation.convertToUpperCase(newName);

                    for (Student std : ls) {
                        if (std.getStName().equalsIgnoreCase(oldName) && std.getID().equalsIgnoreCase(stID)) {
                            std.setStName(newName);
                        }
                    }
                }

                System.out.print("Enter position to update: ");
                int pos = Validation.checkInputInteger();
                System.out.print("Enter new semester: ");
                String newSemester = Validation.checkInputString();
                System.out.print("Enter new course: ");
                String newcourse = enterCourse();

                udList.get(pos).setSemester(newSemester);
                udList.get(pos).setCourseName(newcourse);
                int index = position.get(pos);
                ls.get(index).setSemester(newSemester);
                ls.get(index).setCourseName(newcourse);

                System.out.println("Update sucessfully");
                System.out.printf("%-15s%-20s%-15s%-15s\n", "ID", "Name", "Semester", "Course");
                for (Student o : ls) {
                    System.out.printf("%-15s%-20s%-15s%-15s\n", o.getID(), o.getStName(), o.getSemester(),
                            o.getCourseName());
                }
            } else {
                System.out.println("Can not execute!");
            }

        } else {
            ArrayList<Student> DeList = new ArrayList<>();
            ArrayList<Integer> position = new ArrayList<>();
            System.out.print("Enter ID to delete: ");
            String ID = Validation.checkInputString();
            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i).getID().equalsIgnoreCase(ID)) {
                    DeList.add(ls.get(i));
                    position.add(i);
                }
            }
            if (!DeList.isEmpty()) {
                System.out.printf("%-15s%-20s%-15s%-15s\n", "Position", "Name", "Semester", "Course");
                for (int j = 0; j < DeList.size(); j++) {
                    System.out.printf("%-15s%-20s%-15s%-15s\n", j, DeList.get(j).getStName(),
                            DeList.get(j).getSemester(), DeList.get(j).getCourseName());
                }
                System.out.print("Enter position to delete: ");
                int pos= Validation.checkInputInteger();
                int index= position.get(pos);
                ls.remove(index);
                System.out.println("removed successful!");

                System.out.printf("%-15s%-20s%-15s%-15s\n", "ID", "Name", "Semester", "Course");
                for (Student o : ls) {
                    System.out.printf("%-15s%-20s%-15s%-15s\n", o.getID(), o.getStName(), o.getSemester(),
                            o.getCourseName());
                }
                
            }
        }
    }

    public void report() {
        int numberOfStudent = ls.size();
        int[] total = new int[numberOfStudent];
        for (int i = 0; i < total.length; i++) {
            total[i] = 1;
        }

        for (int i = 0; i < numberOfStudent; i++) {
            String name = ls.get(i).getStName();
            String course = ls.get(i).getCourseName();
            for (int j = i + 1; j < numberOfStudent; j++) {
                if (total[i] != 0) {
                    if (ls.get(j).getStName().equals(name) && ls.get(j).getCourseName().equals(course)) {
                        total[i]++;
                        total[j] = 0;
                    }
                }

            }
        }

        for (int i = 0; i < numberOfStudent; i++) {
            if (total[i] != 0) {
                System.out.println(ls.get(i).getStName() + " | " + ls.get(i).getCourseName() + " | " + total[i]);
            }

        }

    }

}

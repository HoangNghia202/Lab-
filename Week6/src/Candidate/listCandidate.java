package Candidate;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthToolTipUI;

public class listCandidate {
    List<Candidate> list = new ArrayList<>();

    private String checkInputRank(){
        String rank;
       while (true) {
           rank= Validation.checkInputString();
        if (rank.equalsIgnoreCase("excellence") ||rank.equalsIgnoreCase("good")||rank.equalsIgnoreCase("fair")||rank.equalsIgnoreCase("poor")) {
            return rank;
        } else{
            System.out.println("Enter again(excellence or good or fair or poor)");
        }
       }
    }

    public void create(int key) {

        System.out.print("Enter ID: ");
        String candidateID = Validation.checkInputString();
        System.out.print("Enter first name: ");
        String firstName = Validation.checkInputString();
        firstName = Validation.convertToUpperCase(firstName);
        System.out.print("Enter last name: ");
        String lastName = Validation.checkInputString();
        lastName = Validation.convertToUpperCase(lastName);
        System.out.print("Enter year of birth: ");
        String birthDay = Validation.checkInputYear();
        System.out.println("Enter phone number: ");
        String phNum = Validation.checkInputPhoneNumber();
        System.out.print("Enter Email: ");
        String email = Validation.checkInputEmail();
        System.out.print("Enter address: ");
        String address = Validation.checkInputString();

        if (key == 1) {

            System.out.print("Enter experience in year: ");
            int expInYear = Validation.checkInputInt();
            System.out.print("Enter professional skill: ");
            String proSkill = Validation.checkInputString();
            Experience newExp = new Experience(candidateID, firstName, lastName, birthDay, address, phNum, email,
                    expInYear, proSkill);
            list.add(newExp);
            System.out.println("Do you want to continue create(Y/N): ");
            String choice = Validation.checkInputYN();
            if (choice.equalsIgnoreCase("y")) {
                create(1);
            } else {
                return;
            }

        }

        if (key == 2) {

           
                System.out.print("Enter graduation time: ");
                String graTime = Validation.checkInputGraduaYear(birthDay);
                System.out.print("Enter graduation rank: ");
                String graRank =checkInputRank();
                System.out.print("Enter university: ");
                String education = Validation.checkInputString();
                Fresher newFres = new Fresher(candidateID, firstName, lastName, birthDay, address, phNum, email,
                        graTime,
                        graRank, education);
                list.add(newFres);
                System.out.println("Do you want to continue create(Y/N): ");
                String choice = Validation.checkInputYN();
                if (choice.equalsIgnoreCase("y")) {
                    create(2);
                }else{
                    return;
                }
            

        } else {
            if (key == 3) {
                
                    System.out.print("Enter major: ");
                    String majors = Validation.checkInputString();
                    System.out.print("Enter semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter university: ");
                    String uniName = Validation.checkInputString();
                    Intern newInte = new Intern(candidateID, firstName, lastName, birthDay, address, phNum, email,
                            majors,
                            semester, uniName);
                    list.add(newInte);
                    System.out.println("Do you want to continue create(Y/N): ");
                    String choice = Validation.checkInputYN();
                    if (choice.equalsIgnoreCase("y")) {
                        create(3);
                    }else{
                        return;
                    }
                
            }

        }
    }

    public void search() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (Candidate candidate : list) {
            if (candidate instanceof Experience) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate candidate : list) {
            if (candidate instanceof Fresher) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.println("===========INTERN CANDIDATE=============");
        for (Candidate candidate : list) {
            if (candidate instanceof Intern) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }

        System.out.print("Input Candidate name (First name or Last name): ");
        String name = Validation.checkInputString();
        System.out.print("Input type of candidate: ");
        int type = Validation.checkInputIntLimit(0, 2);
        if (type == 0) {
            for (Candidate candidate : list) {
                if (candidate instanceof Experience
                        && (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name))) {
                    System.out.println(candidate.getFirstName() + " | " + candidate.getLastName() + " | "
                            + candidate.getAddress() + " | " + candidate.getPhone() + " | " + candidate.getEmail());
                }
            }
        }

        if (type == 1) {
            for (Candidate candidate : list) {
                if (candidate instanceof Fresher
                        && (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name))) {
                    System.out.println(candidate.getFirstName() + " | " + candidate.getLastName() + " | "
                            + candidate.getAddress() + " | " + candidate.getPhone() + " | " + candidate.getEmail());
                }
            }
        } else {
            if (type == 2) {
                for (Candidate candidate : list) {
                    if (candidate instanceof Intern
                            && (candidate.getFirstName().contains(name) || candidate.getLastName().contains(name))) {
                        System.out.println(candidate.getFirstName() + " | " + candidate.getLastName() + " | "
                                + candidate.getAddress() + " | " + candidate.getPhone() + " | " + candidate.getEmail());
                    }
                }
            }
        }

    }

}

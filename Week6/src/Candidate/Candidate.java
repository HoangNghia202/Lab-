package Candidate;

public class Candidate {
    protected  String candidateID;
    protected String firstName;
    protected  String lastName;
    protected  String birthDay;
    protected  String address;
    protected  String phone;
    protected  String email;

    public Candidate() {
    }

    public Candidate(String candidateID, String firstName, String lastName, String birthDay, String address,
            String phone,
            String email) {
        this.candidateID = candidateID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputGeneralData() {
        System.out.print("Enter ID: ");
        candidateID = Validation.checkInputString();
        System.out.print("Enter first name: ");
        firstName = Validation.checkInputString();
        firstName = Validation.convertToUpperCase(firstName);
        System.out.print("Enter last name: ");
        lastName = Validation.checkInputString();
        lastName = Validation.convertToUpperCase(lastName);
        System.out.print("Enter year of birth: ");
        String birthDay = Validation.checkInputYear();
        System.out.println("Enter phone number: ");
        String phNum = Validation.checkInputPhoneNumber();
        System.out.println("Enter Email: ");
        String email = Validation.checkInputEmail();
        

    }

}

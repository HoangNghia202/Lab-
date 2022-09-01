package Candidate;

public class Intern extends Candidate {
    public String majors;
    public String semester;
    public String uniName;
    public Intern() {
    }

    
   

    public Intern(String candidateID, String firstName, String lastName, String birthDay, String address, String phone,
            String email, String majors, String semester, String uniName) {
        super(candidateID, firstName, lastName, birthDay, address, phone, email);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }


    public String getMajors() {
        return majors;
    }
    public void setMajors(String majors) {
        this.majors = majors;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getUniName() {
        return uniName;
    }
    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    @Override
    public void inputGeneralData() {
        // TODO Auto-generated method stub
        super.inputGeneralData();
    }

    
    

    
    

}

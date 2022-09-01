package Candidate;



public class Fresher extends Candidate {
    public String graduationDate;
    public String graduatioRnank;
    public String education;
    public Fresher() {
    }
    public Fresher(String candidateID, String firstName, String lastName, String birthDay, String address, String phone,
            String email, String graduationDate,String graduatioRnank ,String education) {
        super(candidateID, firstName, lastName, birthDay, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduatioRnank= graduatioRnank;
        this.education = education;
    }
    public String getGraduationDate() {
        return graduationDate;
    }
    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }
    public String getEducation() {
        return education;
    }
    public String getGraduatioRnank() {
        return graduatioRnank;
    }
    public void setGraduatioRnank(String graduatioRnank) {
        this.graduatioRnank = graduatioRnank;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    
    
    

    
}

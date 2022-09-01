package Candidate;

import java.util.concurrent.PriorityBlockingQueue;

public class Experience extends Candidate {
    public int expInYear;
    public String proSkill;
    public Experience() {
    }
    
    public Experience(String candidateID, String firstName, String lastName, String birthDay, String address,
            String phone, String email, int expInYear, String proSkill) {
        super(candidateID, firstName, lastName, birthDay, address, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    public int getExpInYear() {
        return expInYear;
    }
    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    public String getProSkill() {
        return proSkill;
    }
    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
    
    @Override
    public void inputGeneralData() {
        // TODO Auto-generated method stub
        super.inputGeneralData();
    }

    

    
}

package docter_management;

public class DoctorInfor {
    public String code;
    public String name;
    public String specialization;
    public int availability;
    
    public DoctorInfor() {
    }

    public DoctorInfor(String code, String name, String specialization, int availability) {
        this.code = code;
        this.name = name;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

  

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return code+"\t"+name+"\t"+specialization+"\t\t"+availability;
    }
    
}

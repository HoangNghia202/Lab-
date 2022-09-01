package Student_management;

public class Student {
    public String ID;
    public String stName;
    public String semester;
    public String courseName;

    public Student() {
    }

    public Student(String iD, String stName, String semester, String courseName) {
        ID = iD;
        this.stName = stName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }



}

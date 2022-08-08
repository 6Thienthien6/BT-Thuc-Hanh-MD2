package Baitap.java13;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    @Override
    public void showInfo() {
        System.out.println(this);
    }
    public Intern(Integer id, String fullName, String birthDay, String majors, int semester, String universityName) {
        super(id, fullName, birthDay, 2);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public void learn() {
        System.out.println("learning code");
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "\n - majors='" + majors + '\'' +
                "\n - semester=" + semester +
                "\n - universityName='" + universityName + '\'' +
                "\n - id=" + id +
                "\n - fullName='" + fullName + '\'' +
                "\n - birthDay='" + birthDay + '\'' +
                "\n - phone='" + phone + '\'' +
                "\n - email='" + email + '\'' +
                "\n - employeeType=" + employeeType +
                "\n - certificates=" + certificates +
                '}';
    }
}

package Baitap.java13;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String education;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

//    public Fresher(){
//        super(null, null, null, 1);
//    }


    public Fresher(Integer id, String fullName, String birthDay, int employeeType, String graduationDate, String graduationRank, String education) {
        super(id, fullName, birthDay, employeeType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public void code() {
        System.out.println("code & code");
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "\n - graduationDate='" + graduationDate + '\'' +
                "\n - graduationRank='" + graduationRank + '\'' +
                "\n - education='" + education + '\'' +
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


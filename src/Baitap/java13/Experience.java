package Baitap.java13;

public class Experience extends Employee {
    private int expInYear;
    private String proSkill;

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public void analytic() {
        System.out.println("Analytic Project");
    }

//    public Experience() {
//        super(null, null, null, 0);
//    }

//    public Experience() {
//        super(id, fullName,birthDay, 0);
//
//    }

    public Experience(Integer id, String fullName, String birthDay, int employeeType, int expInYear, String proSkill) {
        super(id, fullName, birthDay, employeeType);
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
    public String toString() {
        return "Experience{" +
                "\n - expInYear=" + expInYear +
                "\n - proSkill='" + proSkill + '\'' +
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

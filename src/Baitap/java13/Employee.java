package Baitap.java13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class  Employee {
    protected Integer id;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected int employeeType;
    protected List<Certificate> certificates;

    public abstract void showInfo();

    public Employee(Integer id, String fullName, String birthDay, int employeeType) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.employeeType = employeeType;
        this.certificates = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return LocalDate.parse(birthDay);
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
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

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }
}

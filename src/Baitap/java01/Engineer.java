package Baitap.java01;

public class Engineer extends Canbo {
    private String branch;

    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch =branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                "branch='" + branch + '\'' +
                '}';
    }
}

package Baitap.java01;

public class Congnhan extends Canbo {
private int level;

    public Congnhan(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level= level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Congnhan{" +

                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                "level=" + level +
                '}';
    }
}

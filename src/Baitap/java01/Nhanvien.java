package Baitap.java01;

public class Nhanvien extends Canbo{
    private String Task;
    public Nhanvien(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.Task = Task;

    }

    public String getTask() {
        return Task;
    }

    public void setTask(String task) {
        Task = task;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                ", name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                "Task='" + Task +
                '}';
    }
}

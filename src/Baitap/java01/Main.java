package Baitap.java01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("\n" + "Cán bộ quản lý ứng dụng");
            System.out.println("Nhấn 1: để thêm cán bộ");
            System.out.println("Nhấn 2: Tìm kiếm theo tên: ");
            System.out.println("Nhấn 3: Hiện thị thông tin về danh sách các cán bộ . ");
            System.out.println("Nhấn 4: để thoát chương trình :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhấn a: để thêm kỹ sư !");
                    System.out.println("Nhấn b: để thêm công nhân !");
                    System.out.println("Nhấn c: để thêm nhân viên !");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập tuổi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhập Địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhập Ngành: ");
                            String branch = scanner.nextLine();
                            Canbo engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addCanbo(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập tuổi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhập Địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhập cấp độ: ");
                            int level = scanner.nextInt();
                            Canbo worker = new Congnhan(name, age, gender, address, level);
                            managerOfficer.addCanbo(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhập tên: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhập tuổi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhập giới tính: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhập Địa chỉ: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhập công việc: ");
                            String task = scanner.nextLine();
                            Canbo staff = new Nhanvien(name, age, gender, address, task);
                            managerOfficer.addCanbo(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("không hợp lệ");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhập tên cần tìm kiếm: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchCanboByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListinforCanbo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("không hợp lệ");
                    continue;
            }

        }
    }
}


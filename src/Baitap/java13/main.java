package Baitap.java13;


import Baitap.java13.ui.ScannerFactory;
import Baitap.java13.ui.UIManager;

import java.sql.Struct;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Employee em1 = new Experience(1,"Phan Thanh Hi", "12/04/1998",0,2,"PHP");
//        Employee em2 = new Fresher(2, "Nguyen Van Hai", "21/03/2000",);
//        Employee em3 = new Intern(3, "Thanh Thai", "22/05/1999", "KTMT", 2, "Sience Univesity");

//        em1.showInfo();
//        showSkills(em1);
//        em2.showInfo();
//        showSkills(em2);
//        em3.showInfo();
//        showSkills(em3);
//
//
////        System.out.println(employees[0]);
////        System.out.println(employees[1]);
////        System.out.println(employees[2]);
//
//    }
//
//    private static void showSkills(Employee employee) {
//        if (employee instanceof Experience)
//            ((Experience) employee).analytic();
//        if (employee instanceof Fresher)
//            ((Fresher) employee).code();
//        if (employee instanceof Intern)
//            ((Intern) employee).learn();
//    }

        UIManager uiManager = new UIManager();
        Scanner scanner = ScannerFactory.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To show list");
            System.out.println("Enter 3: To delete");
            System.out.println("Enter 4: To update:");
            System.out.println("Enter 5: To exit:");
            Integer ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    // input 0 => insert Experience
                    // input 1 => insert Fresher
                    // input 2 => insert Intern
                    System.out.println(" input 0 => insert Experience ");
                    System.out.println(" input 1 => insert Fresher ");
                    System.out.println(" input 2 => insert Intern ");
                    int type = scanner.nextInt();
                    uiManager.insert(type);
                    ;
                    break;
                case 2:
                    uiManager.showAllEmployee();
                    break;
                case 3:
                    uiManager.delete();
                    break;
                case 4:
                    uiManager.update();

                default:
                    System.out.println("Enter your choice please!!");

                case 5:
                    System.exit(0);
            }
        }

    }
}




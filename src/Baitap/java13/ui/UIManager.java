package Baitap.java13.ui;

import Baitap.java13.Employee;
import Baitap.java13.Experience;
import Baitap.java13.Fresher;
import Baitap.java13.Intern;
import Baitap.java13.exception.BirthDayException;
import Baitap.java13.exception.EmailException;
import Baitap.java13.exception.FullNameException;
import Baitap.java13.exception.PhoneException;
import Baitap.java13.service.EmployeeManager;
import Baitap.java13.service.Validator;

import java.util.Scanner;

public class UIManager {
    private EmployeeManager employeeManager = new EmployeeManager();
//           * @param type
//     * @return Employee
//     * type = 0 => Experience
//     * type = 1 => Fresher
//     * type = 2 => Intern
//     */
public void insert(int type) {
    Employee employee = null;
    if (type == 0) {
        employee = insertExperience();
    }
    if (type == 1) {
        employee = insertFresher();
    }
    if (type == 2) {
        employee = insertIntern();
    }

    try {
        checkData(employee);
    } catch (BirthDayException e) {
        insert(type);
    } catch (PhoneException e) {
        insert(type);
    } catch (EmailException e) {
        insert(type);
    } catch (FullNameException e) {
        insert(type);
    }

    this.employeeManager.insert(employee);
}

    private Experience insertExperience() {
        Experience experience = new Experience(1,"Phan Thanh Hi", "12/04/1998",0,2,"PHP");
//        Scanner scanner = ScannerFactory.getScanner();
        Scanner scanner1 = new Scanner(System.in);
      System.out.println("Input ID:");
String id = Integer.parseInt.nextLine();
        System.out.println("Input Name:");
        String name = scanner1.nextLine();
        System.out.println("Input Phone:");
        String phone = scanner1.nextLine();
        System.out.println("Input Email:");
        String email = scanner1.nextLine();
3
        return experience;
    }

    private Intern insertIntern() {

        Intern intern = new Intern(3, "Thanh Thai", "22/05/1999", "KTMT", 2, "Sience Univesity");
        Scanner scanner = ScannerFactory.getScanner();
        System.out.println("Input ID:");
        int id = scanner.nextInt();
        System.out.println("Input Name:");
        String name = scanner.nextLine();
        System.out.println("Input Phone:");
        String phone = scanner.nextLine();
        System.out.println("Input Email:");
        String email = scanner.nextLine();
        return intern;
    }

    private Fresher insertFresher() {
        Fresher fresher = new Fresher(2,"Nguyen Van Hi", "23/04/2000",1,"2012","good","2012 - 2016");
        Scanner scanner = ScannerFactory.getScanner();
        System.out.println("Input ID:");
        int id = scanner.nextInt();
        System.out.println("Input Name:");
        String name = scanner.nextLine();
        System.out.println("Input Phone:");
        String phone = scanner.nextLine();
        System.out.println("Input Email:");
        String email = scanner.nextLine();
        return fresher;
    }

    public void update() {
        System.out.print("Input ID to update: ");
        String id = ScannerFactory.getScanner().nextLine();
        Employee employee = this.employeeManager.findById(Integer.parseInt(id));
        System.out.println("update success " );
    }

    public void delete() {
        System.out.print("Input ID to deleet: ");
        String id = ScannerFactory.getScanner().nextLine();
        this.employeeManager.deleteById(Integer.parseInt(id));
        System.out.println("delete success ");
    }

    public void showAllEmployee() {
        this.employeeManager.findAll().forEach(Employee::showInfo);
    }

    private void checkData(Employee employee) throws BirthDayException, PhoneException, EmailException, FullNameException {
        Validator.birthdayCheck(employee.getBirthDay());
        Validator.phoneCheck(employee.getPhone());
        Validator.emailCheck(employee.getEmail());
        Validator.nameCheck(employee.getFullName());
    }

    }

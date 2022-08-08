package Baitap.java13.exception;

public class FullNameException extends Exception {
    public void FullNameException(String message) {
        System.out.println("Tên nhập không đúng mời nhập lại: " + message);

    }
}

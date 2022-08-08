package Baitap.java13.service;

import Baitap.java13.exception.BirthDayException;
import Baitap.java13.exception.EmailException;
import Baitap.java13.exception.FullNameException;
import Baitap.java13.exception.PhoneException;

import java.time.LocalDate;

public class Validator {
    public static void birthdayCheck(LocalDate birthday) throws BirthDayException {
        if (birthday == null) {
            throw new BirthDayException( birthday);
        }
        if (birthday.isAfter(LocalDate.now())) {
            throw new BirthDayException(birthday);
        }
    }
    public static void phoneCheck(String phone) throws PhoneException {
        if (phone == null) {
            throw new PhoneException(phone);
        }
        if (phone.length() == 0) {
            throw new PhoneException(phone);
        }
    }
    public static void emailCheck(String email) throws EmailException {
        if (email == null) {
            throw new EmailException();

        }
    }
    public static void nameCheck(String name) throws FullNameException {
        if (name == null) {
            throw new FullNameException();
        }

    }
}

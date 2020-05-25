package furamaResort.exception;

import java.util.Scanner;

public class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }
    public static String nameException(String name) throws NameException {
        String regex = "^([A-Z][a-z]+\\s?)+$";
        if (name.matches(regex)) {
            return name;
        } else {
            throw new NameException("Name is invalid! Please try again");
        }
    }

}

package furamaResort.validation;

import java.util.Scanner;

public class Validation {
    private static String regex = "";
    private static Scanner scanner;


    public static Boolean checkCodeVilla(String code) {
        regex = "^SVVL-[0-9]{4}$";
        return code.matches(regex);
    }
    public static Boolean checkCodeHouse(String code) {
        regex = "^SVHO-[0-9]{4}$";
        return code.matches(regex);
    }
    public static Boolean checkCodeRoom(String code) {
        regex = "^SVRO-[0-9]{4}$";
        return code.matches(regex);
    }
    public static Boolean checkNameService(String name) {
        regex = "^[A-Z][a-z]+$";
        return name.matches(regex);
    }
    public static Boolean checkPoolArea(int area) {
        return area >= 30;
    }
    public static Boolean checkRentalCost(String cost) {
        regex = "^[0-9]{1,}$";
        return cost.matches(regex);
    }
    public static Boolean checkMaxPeople(String num) {
        regex = "^([0-1][0-9]|[1-9])$";
        return num.matches(regex);
    }
    public static Boolean checkFloorNumber(String floor) {
        regex = "^[0-9]{1,}$";
        return floor.matches(regex);
    }


}

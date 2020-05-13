package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
//        check1();
        check2();

    }
    public static void check1(){
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter year: ");
        year=scanner.nextInt();
        boolean isLeapYear=false;
        if(year%4==0){
            if(year%100==0){
                if (year%400==0){
                    isLeapYear=true;
                }else {
                    isLeapYear=false;
                }
            }else {
                isLeapYear=true;
            }
        }else {
            isLeapYear=false;
        }
        if(isLeapYear){
            System.out.printf("%d is leap year",year);
        }else {
            System.out.printf("%d is not leap year",year);
        }
    }

    public static void check2(){
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter year: ");
        year=scanner.nextInt();
        boolean isLeapYear=false;
        boolean isDivisibleBy4=year%4==0;
        if(isDivisibleBy4){
            boolean isDivisibleBy100=year%100==0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400=year%400==0;
                if (isDivisibleBy400){
                    isLeapYear=true;
                }else {
                    isLeapYear=false;
                }
            }else {
                isLeapYear=true;
            }
        }else {
            isLeapYear=false;
        }
        if(isLeapYear){
            System.out.printf("%d is leap year",year);
        }else {
            System.out.printf("%d is not leap year",year);
        }
    }
}

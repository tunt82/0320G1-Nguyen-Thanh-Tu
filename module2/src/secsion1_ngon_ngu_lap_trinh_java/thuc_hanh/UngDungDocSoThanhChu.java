package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.print("Input number: ");
        int num=number.nextInt();
        if(0<=num && num<20) {
            switch (num) {
                case 0:
                    System.out.print("Zero");
                    break;
                case 1:
                    System.out.print("One");
                    break;
                case 2:
                    System.out.print("Two");
                    break;
                case 3:
                    System.out.print("Three");
                    break;
                case 4:
                    System.out.print("Four");
                    break;
                case 5:
                    System.out.print("Five");
                    break;
                case 6:
                    System.out.print("Six");
                    break;
                case 7:
                    System.out.print("Seven");
                    break;
                case 8:
                    System.out.print("Eight");
                    break;
                case 9:
                    System.out.print("Nine");
                    break;
                case 10:
                    System.out.print("Teen");
                    break;
                case 11:
                    System.out.print("Eleven");
                    break;
                case 12:
                    System.out.print("Twelve");
                    break;
                case 13:
                    System.out.print("Thirteen");
                    break;
                case 14:
                    System.out.print("Fourteen");
                    break;
                case 15:
                    System.out.print("Fifteen");
                    break;
                case 16:
                    System.out.print("Sixteen");
                    break;
                case 17:
                    System.out.print("Seventeen");
                    break;
                case 18:
                    System.out.print("Eighteen");
                    break;
                case 19:
                    System.out.print("Nineteen");
                    break;
            }

        }else if(20<=num && num<99){
            switch (num/10){
                case 2:
                    System.out.print("Twenty");
                    break;
            }
            switch (num % 10){
                case 1:
                    System.out.print(" One");
                    break;
            }
        }

    }
}

package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class DisplaySalutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Hello "+name);


    }
}

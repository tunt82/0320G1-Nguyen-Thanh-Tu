package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number: ");
        int num= Integer.parseInt(sc.nextLine());
        if(num<2)
            System.out.print("Num is not prime");
        else{
            int i=2;
            boolean check=true;
            while (i<=Math.sqrt(num)){
                if(num%i==0) {
                    check=false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.print("Number is prime");
            else {
                System.out.print("Number is not prime");
            }

        }
    }
}
// Prime is 2, 3, 5, 7, 11, 13, 17, 19, 23, 29,….

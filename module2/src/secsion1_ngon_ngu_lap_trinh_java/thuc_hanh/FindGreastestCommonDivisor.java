package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class FindGreastestCommonDivisor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a: ");
        a=input.nextInt();
        System.out.print("Enter b: ");
        b=input.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 || b==0){
            System.out.print("No greatest common factor");
        }
        while (a!=b){
            if(a>b){
                a=a-b;
            }else {
                b=b-a;
            }

        }
        System.out.print("Greatest common fator: "+a);
    }
}

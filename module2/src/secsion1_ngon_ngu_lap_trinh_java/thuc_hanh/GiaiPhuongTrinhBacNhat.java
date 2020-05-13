package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b;
        System.out.print("a: ");
        a=sc.nextDouble();
        System.out.print("b: ");
        b=sc.nextDouble();
        if(a!=0){
            double answer=-b/a;
            System.out.println("Kết quả: "+answer);
        }else {
            if(b==0){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution");
            }
        }

    }
}

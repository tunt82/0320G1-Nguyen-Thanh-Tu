package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class CalculateMoneyInvest {
    public static void main(String[] args) {
        calAmountMoney();

    }
    public static void calAmountMoney(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input investmen amount: ");
        int money=sc.nextInt();
        System.out.print("Input number of month: ");
        int month=sc.nextInt();
        System.out.print("Input annual interset rate in percentage: ");
        float rate=sc.nextFloat();

        double total_interset=0;
        for (int i=0; i<month; i++){
            total_interset+=money*(rate/100)/12;
        }
        double totalMoney=money+total_interset;
        System.out.printf("%.1f",totalMoney);
    }
}

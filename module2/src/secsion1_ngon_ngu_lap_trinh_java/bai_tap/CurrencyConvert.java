package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        curConvert();
    }
    public static void curConvert(){
        double rate=23000;
        double USD=0;
        double VND;

       while (true) {
           System.out.print("Enter USD: ");
           Scanner scanner=new Scanner(System.in);
           try {

               USD = scanner.nextDouble();
               break;
           } catch (Exception e) {
               System.out.println("Inputed Number was wrong! ");
           }
       }
        VND=USD*rate;
        System.out.print("The amount of money converted from USD to VND is: "+VND);
    }
}

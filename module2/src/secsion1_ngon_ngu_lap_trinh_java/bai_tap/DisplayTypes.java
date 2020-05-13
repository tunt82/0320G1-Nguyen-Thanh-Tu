package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice=-1;
        Scanner input=new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Draw the square");
            System.out.println("2. Draw triangle_bottom-left");
            System.out.println("3. Draw triangle_top-left");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    rec();
                    break;
                case 2:
                    tria_bottomLeft();
                    break;
                case 3:
                    tria_topLeft();
                    break;
                case 0:
                    System.exit(0);
//                    Hoặc choice=0;
                    break;
                default:
                    System.out.println("No choice!");

            }
        }
    }
    protected static void rec(){
        for (int i=0; i<3; i++){
            for (int j=0; j<7; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    protected static void tria_bottomLeft(){
        for (int i=0; i<=5; i++){
            for (int j=0; j<i; j++){
                String c=" ";
                System.out.print("*"+c);
            }
            System.out.print("\n");
        }
    }
    protected static void tria_topLeft(){
        for (int i=5; i>0; i--){
            for (int j=0; j<i; j++){
                String c=" ";
                System.out.print("*"+c);
            }
            System.out.print("\n");
        }
    }
}

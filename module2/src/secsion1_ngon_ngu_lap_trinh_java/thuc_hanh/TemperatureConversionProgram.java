package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;

import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to celsius");
            System.out.println("2. Celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.printf("Fahrenheit to Celsius: %.2f", fahrenheitToCelsius(fahrenheit));
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius=input.nextDouble();
                    System.out.println("Celsius to fahrenheit: "+celsiusToFahrenheit(celsius));
                    System.out.print("\n");
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit=(9.0/5)*celsius+32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius=(5.0 / 9) * (fahrenheit - 32);
        return  celsius;
    }
}

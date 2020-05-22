package section3_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double x1;
        double x2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a: ");
        double a=input.nextDouble();
        System.out.print("Enter b: ");
        double b=input.nextDouble();
        System.out.print("Enter c: ");
        double c=input.nextDouble();

        Equation calculate=new Equation(a,b,c);
        if(calculate.delta()>0){
            x1=calculate.findRoot1();
            x2=calculate.findRoot2();
            System.out.printf("Root1 is %.2f",x1);
            System.out.printf("\n"+"Root2 is %.2f",x2);
        }else if(calculate.delta()==0){
            System.out.println("The equation has 2 solutions which is "+calculate.findRoot2());
        }else {
            System.out.println("The equation has no solution");
        }
    }

    static class Equation{
        private double a,b,c;

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }

        public double delta(){
          return Math.pow(this.b,2)-4*this.a*this.c;
        }
        public double findRoot1(){
            return (-b+Math.sqrt(this.delta()))/(2*this.a);
        }
        public double findRoot2(){
            return (-b-Math.sqrt(this.delta()))/(2*this.a);
        }

        public Equation(double a,double b,double c){
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }

}
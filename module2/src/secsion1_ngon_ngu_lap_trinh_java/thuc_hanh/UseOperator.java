package secsion1_ngon_ngu_lap_trinh_java.thuc_hanh;


import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width=scanner.nextFloat();
        System.out.println("Nhập chiều dài: ");
        height=scanner.nextFloat();

        float area=width*height;
        System.out.println("Rectangle area is: "+ area);
    }
}

package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) throws Exception {
//        try {
//            FileReader fileReader = new FileReader("E:/thongtinhocvien.txt");
//            System.out.println("Da doc xong file");
//        } catch (FileNotFoundException e) {
//            System.out.println("Thay loi xuat hien");
//        }

//        System.out.println(tenHocVien);

//        int[] a = {1, 2, 3, 4};
//
//        for (int i = 0; i <= a.length; i++) {
//            System.out.println(a[i]);
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so 1: ");
//        int a = scanner.nextInt();
//        System.out.println("Nhap so 2: ");
//        int b = scanner.nextInt();
//
//        System.out.println(a/b);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap so bat ki: ");
            int a = scanner.nextInt();

            if (a % 2 == 0) {
                throw new KiemTraSoChanException();
            }
        } catch (Exception e) {
            System.out.println("Ban nhap so chan. Vui long nhap lai.");
        }
    }
}

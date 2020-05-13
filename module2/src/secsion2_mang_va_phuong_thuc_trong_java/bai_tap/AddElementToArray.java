package secsion2_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int element;
        int index;
        int [] array={1,2,3,4,5,0,0,0};
        int [] arr=new int[array.length+1];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element: ");
        element=Integer.parseInt(sc.nextLine());
        System.out.println("Enter index: ");
        index=Integer.parseInt(sc.nextLine());

        for (int i=0;i<array.length; i++){
            if (i==index) {
                for (int j=array.length-1; j>i; j--){
                    array[j]=array[j-1];
                }
                array[i]=element;
            }
        }
        System.out.print(Arrays.toString(array));

    }
}

package secsion2_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        maxValue();
    }
    public static void maxValue(){
        int size;
        int[] array;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter size: ");
            size=Integer.parseInt(sc.nextLine());
        }

        while (size>20);
        if(size>20){
            System.out.print("Size should not exceed 20");
        }
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.print("Enter elements "+(i+1)+": ");
            array[i]=Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.print("Property list: ");
        for (int j=0; j<array.length; j++){
            System.out.print(array[j]+"\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}

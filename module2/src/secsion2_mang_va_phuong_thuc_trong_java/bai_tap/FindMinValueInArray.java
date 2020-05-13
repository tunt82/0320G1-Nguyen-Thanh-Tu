package secsion2_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        findMaxValue();
    }
    public static void findMaxValue(){
        Scanner input=new Scanner(System.in);
        int[] arr;
        int size;
        System.out.print("Enter size of array: ");
        size=Integer.parseInt(input.nextLine());
        while (size>10){
            System.out.print("Size should not exceed 10, please again: ");
            size=Integer.parseInt(input.nextLine());
        }
        arr=new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Enter element "+(i+1)+": ");
            int element=Integer.parseInt(input.nextLine());
            arr[i]=element;
        }
        System.out.print("Element list: "+Arrays.toString(arr));
        int min=arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }

        }
        System.out.print("\n"+"Min value is: "+min);
    }
}

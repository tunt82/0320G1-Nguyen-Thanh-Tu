package secsion2_mang_va_phuong_thuc_trong_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;

        do{
            System.out.print("Enter array of size: ");
            size=Integer.parseInt(sc.nextLine());
            if(size>20){
                System.out.println("Size does not exceed 20 ");
            }
        }while (size>20);
        int [] array=new int[size];
        for (int i=0; i<size; i++){
            System.out.print("Enter element "+(i+1)+": ");
            int element=Integer.parseInt(sc.nextLine());
            array[i]=element;
        }
        System.out.println("Element in array that is: "+Arrays.toString(array));
        for (int i=0; i<array.length/2; i++){
            int temp=array[i];
            array[i]=array[size-1-i];
            array[size-1-i]=temp;
        }
        System.out.print("Reversed element in array that is: "+Arrays.toString(array));

    }
}

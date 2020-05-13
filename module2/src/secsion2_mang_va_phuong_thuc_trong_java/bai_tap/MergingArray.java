package secsion2_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Arrays;

public class MergingArray {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b={4,5,6};
        int [] c=new int[6];
        for (int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for (int i=0; i<b.length; i++){
            c[a.length+i]=b[i];
        }
        System.out.print(Arrays.toString(c));
    }
}

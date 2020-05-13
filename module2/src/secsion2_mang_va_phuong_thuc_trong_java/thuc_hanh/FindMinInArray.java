package secsion2_mang_va_phuong_thuc_trong_java.thuc_hanh;

public class FindMinInArray {
    public static void main(String[] args) {
        int [] ar={30,10,4};
        int min= minValue(ar);
        System.out.print("Min value is: "+min);
    }
    public static int minValue(int []array){
        int min=array[0];
        for (int i=0;i<array.length; i++){
            if(array[i]<min){
                min=array[i];
            }
        }

        return min;
    }

}

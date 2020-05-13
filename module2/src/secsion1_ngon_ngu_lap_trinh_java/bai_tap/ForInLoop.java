package secsion1_ngon_ngu_lap_trinh_java.bai_tap;

public class ForInLoop {
    public static void main(String[] args) {
        int a= m(1,2,3);
        System.out.print(a);
    }
    static int m(int...x) {
        int b = 0;
        for(int a:x){
            b+=a;
        }
        return b;
    }
}

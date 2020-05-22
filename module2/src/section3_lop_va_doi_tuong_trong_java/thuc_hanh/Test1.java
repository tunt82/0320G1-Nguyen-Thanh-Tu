package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Test1 {
    static public int X = 2;

    static {
        X = 1;
    }
    public void method() {
        X = 5;
    }

    public static void main(String[] args) {
        Test1 a=new Test1();
        System.out.println(a.X);
        a.method();
        System.out.println(X);
    }
}

package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Person   {
    static String name="Tu";
    int age=2;
    public void saySalutation(){
        System.out.print("Helo Tu");
    }
    public Person(){};

    public static void main(String[] args) {
        System.out.println(Person.name);
    }


}
//class Student extends Test2 {
//    public static void main(String[] args) {
//        Test2 sum=new Test2();
//        System.out.print(total());
//    }
//
//}

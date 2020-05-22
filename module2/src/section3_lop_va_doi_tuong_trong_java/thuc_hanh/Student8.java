package section3_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Student8 {
    int rollno;
    String name;
    static String college = "BachKhoa";

    Student8(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        Student8 s1 = new Student8(111, "Hoang");
        Student8 s2 = new Student8(222, "Thanh");
        s1.display();
        s1.college="Kinh te";
        s1.rollno=20;
        s1.display();
        s2.display();
    }
}

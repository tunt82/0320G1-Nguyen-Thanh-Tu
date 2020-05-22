package section3_lop_va_doi_tuong_trong_java.thuc_hanh;


import static section3_lop_va_doi_tuong_trong_java.thuc_hanh.Sum.total;

public class HighSchoolStudent extends Student{
    public HighSchoolStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void doExercise(int a, int b, int c) {
        super.doExercise(a,b,c);
        int result = total(a,b);
        System.out.println("Sum 3 numbers, result is " + result);
    }
    public void greeting() {
        System.out.println("high school student say hello");
    }
    public static void main(String[] args) {
        //hoc sinh 1
        Student stu1 = new HighSchoolStudent("DUy", 18);
        //stu1.greeting
        stu1.doExercise(1,2,4);
        stu1.address="Ha Noi";
        // hoc sinh 2
        HighSchoolStudent stu2 = new HighSchoolStudent("Tu", 20);
        stu2.doExercise(4,2,4);
        System.out.println(stu1.address);
    }
}

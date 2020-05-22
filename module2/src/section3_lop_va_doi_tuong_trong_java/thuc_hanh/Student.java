package section3_lop_va_doi_tuong_trong_java.thuc_hanh;
import section3_lop_va_doi_tuong_trong_java.thuc_hanh.Sum;

public class Student {
    private String  name;
    int age;
    String address="Da Nang";
    public void salutation (){
        System.out.printf("I'm %s, hello everybody",name);
    }
    public void doExercise(int a, int b, int c){
        System.out.println("Đang làm bài tập");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

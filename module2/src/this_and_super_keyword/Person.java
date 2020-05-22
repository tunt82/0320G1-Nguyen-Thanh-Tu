package this_and_super_keyword;

public class Person {
    String ten;
    private int age=20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void thongTin(){
        this.ten="A";
        System.out.println("Tên của class cha là: "+this.ten);
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.age=40;
        System.out.println(person.age);

    }
}

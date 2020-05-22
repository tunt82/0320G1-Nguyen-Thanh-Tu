package this_and_super_keyword;

public class Employee extends Person {
    final String ten="Tu";

//    public void thongTin(){
//        this.ten="B";
//        System.out.println("Thông tin class con là: "+this.ten);
//    }

    public static void main(String[] args) {
        Employee e=new Employee();
        e.setAge(10);
        System.out.println(e.getAge());
    }
}

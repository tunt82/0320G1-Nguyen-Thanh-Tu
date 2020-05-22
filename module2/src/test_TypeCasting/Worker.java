package test_TypeCasting;

public class Worker extends Employee {
    String name="Hương";
    int age=30;
    String address="Thanh Khê";

    public Worker() {
    }

    public Worker(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public void sallary(){
        System.out.println("Lương công nhân là");
    }
    public double sallary_worker1(String name,double luong){
        return luong;
    }
    public void sallary_worker2(){
        System.out.println("Lương công nhân 2");
    }
    public void sallary_worker3(){
        System.out.println("Lương công nhân 3");
    }
}
class Adder{
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}

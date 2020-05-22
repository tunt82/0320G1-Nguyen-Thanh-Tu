package test_TypeCasting;

public class Person {
    String name;
    int age;
    String address;
    public void sallary(){
        System.out.println("Lương");
    }
    public void sallary_person(){
        System.out.println("Lương person");
    }

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

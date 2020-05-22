package test_TypeCasting;

public class Employee extends Person {
    String name="Tú";
    int age=38;
    String address="Thanh Khê";
    String luong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public void sallary(){
        System.out.println("Lương employee là");
    }
    public void sallary_employee1(){
        System.out.println("Lương employee 1");
    }
    public void sallary_employee2(){
        System.out.println("Lương employee 2");
    }

    public Employee() {
    }

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}

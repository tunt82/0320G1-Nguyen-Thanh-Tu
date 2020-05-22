package test_TypeCasting;

public class Main {
    public static void main(String[] args) {
        int x=5;
        Worker worker=new Worker();
        Employee worker1=worker;
        Person p1=new Employee();
        Object worker3=new Worker();
        Employee employee=new Employee();
        Person e1=new Employee();
        Person person=new Person();



        System.out.println(worker.name);
        worker.sallary();
        //Employee worker4=(Employee) worker2;
        System.out.println(worker1 instanceof Employee);







    }
}

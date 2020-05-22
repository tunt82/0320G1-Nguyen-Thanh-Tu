package secsion6_data_structure.thuc_hanh.example;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {
    public static void main(String[] args) {
        Person person1=new Person(1);
        Person person2=new Person(2);
        Person person3=new Person(3);
        Employee employee=new Employee("Trà");
        System.out.println(employee.getName());
        List<Person> list=new LinkedList<Person>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println(list.size());
        for (Person p:list){
            System.out.println(p.getId());
        }
    }


}

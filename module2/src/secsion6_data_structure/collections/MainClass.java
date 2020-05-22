package secsion6_data_structure.collections;

import abstract_interface.HocVienCodeGym;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Array List 0----------------------");
//        MyArrayList myArrayList = new MyArrayList();
//        myArrayList.add("abc");
//        myArrayList.add(new HocVienCodeGym("Tien", "2000", "tiennvt"));

//        myArrayList.printList();

//        MyArrayList myArrayList2 = myArrayList.clone();
//        myArrayList2.add("5");
//
//        System.out.println("Array List 1----------------------");
//        myArrayList.printList();
//        System.out.println("Array List 2----------------------");
//        myArrayList2.printList();
//
//
        System.out.println("Linked List 0----------------------");
        MyLinkedList myLinkedList = new MyLinkedList("xyz");
        myLinkedList.add(9);
        myLinkedList.add(8);
        myLinkedList.add(7);

        myLinkedList.printList();

        MyLinkedList myLinkedList2 = myLinkedList.clone();
        myLinkedList2.add("5");

        System.out.println("Linked List 1----------------------");
        myLinkedList.printList();
        System.out.println("Linked List 2----------------------");
        myLinkedList2.printList();

    }
}

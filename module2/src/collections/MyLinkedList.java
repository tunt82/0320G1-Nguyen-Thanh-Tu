package collections;

public class MyLinkedList {
    private int size;
    private Node head;

    private class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

    public MyLinkedList(Object data) {
        this.head = new Node(data);
        size++;
    }

    public void add(Object data) {

        Node pointer = head;
        for (int i = 0; i < size - 1; i++) {
            pointer = pointer.next;
        }

        Node newNode = new Node(data);
        pointer.next = newNode;
        size++;
    }

    public void printList() {
        Node pointer = head;

        while(pointer != null) {
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
    }

    public MyLinkedList clone() {
        MyLinkedList myLinkedList = new MyLinkedList(head.data);

        Node pointer = head.next;
        for (int i = 1; i < size; i++) {
            myLinkedList.add(pointer.data);
            pointer = pointer.next;
        }

        return myLinkedList;
    }
}

package secsion6_data_structure.collections;

import java.util.Arrays;

public class MyArrayList {
    private int size;
    private Object[] array;
    private final static int DEFAULT_CAPACITY = 3;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object data) {
        array[size++] = data;
    }

    public void printList() {

        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public void ensureCapacity() {
        array = Arrays.copyOf(array,MyArrayList.DEFAULT_CAPACITY * 2);
    }

    public MyArrayList clone() {
        MyArrayList myArrayList = new MyArrayList();

        for (int i = 0; i < size; i++) {
            myArrayList.array[i] = array[i];
        }

        myArrayList.size = size;

        return myArrayList;
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(22);
        myArray.add(2);
        myArray.modify(2, 4);
        myArray.add(100);
        myArray.add(82);
        myArray.delete(4);
        myArray.display();
    }
}

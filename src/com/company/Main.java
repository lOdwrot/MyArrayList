package com.company;


public class Main {

    public static void main(String[] args) {

        MyArray myArray = new MyArray();
        System.out.println(myArray.isEmpty());

        myArray.add(5);
        myArray.add(10);
        myArray.add(15);
        myArray.add(20);
        System.out.println(myArray.size());
        System.out.println(myArray.indexOf(20));

        System.out.println(myArray.get(1));
        System.out.println(myArray.get(3));
        System.out.println(myArray.isEmpty());
        myArray.remove(1);
        System.out.println(myArray.get(3));
        System.out.println(myArray.isEmpty());
        myArray.clear();
        System.out.println(myArray.isEmpty());
    }
}

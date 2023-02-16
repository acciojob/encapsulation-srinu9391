package com.example;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // try setting a value to name by directly accessing it using obj
        obj.name = "John"; // This will give an error as name is a private member variable

        // try printing the value of name
        System.out.println(obj.name); // This will also give an error as name is a private member variable

        // set the value of name using setter function
        obj.setName("John");

        // get the value of name using getter function
        String name = obj.getName();
        System.out.println(name); // This will print "John"
    }
}

package com.example;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // try setting a value to name by directly accessing it using obj
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        obj.name = s; // This will give an error as name is a private member variable

        // try printing the value of name
        System.out.println(obj.name); // This will also give an error as name is a private member variable

        // set the value of name using setter function
        obj.setName(s);

        // get the value of name using getter function
        String name = obj.getName();
        System.out.println(name); // This will print "John"
    }
}

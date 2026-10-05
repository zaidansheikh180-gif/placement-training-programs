package com.tech.shield.service;

public class StringCompare {
    public static void main(String[] args) {
        String name1 = new String("Sam");
        String name2 = new String("Sam");
        String name3 = "Sam";
        String name4 = "Sam";

        System.out.println(name1 == name2);
        System.out.println(name3 == name2);
        System.out.println(name3 == name4);
    }
}

package com.kodewala.objects;

public class Q7 {

    static int value = 5;

    static {
        value *= 2;
        display();
    }

    static void display() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println(value);
    }
}
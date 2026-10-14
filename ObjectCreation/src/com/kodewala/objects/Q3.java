package com.kodewala.objects;

public class Q3 {

    static {
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
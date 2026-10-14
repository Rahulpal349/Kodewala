package com.kodewala.objects;

public class Q1 {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Q1() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
    }
}

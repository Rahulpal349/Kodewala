package com.kodewala.objects;

public class Q6 {

    {
        System.out.println("Instance Block");
    }

    Q6() {
        System.out.println("Default Constructor");
    }

    Q6(int x) {
        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {
        new Q6();
        new Q6(10);
    }
}
package com.kodewala.objects;

public class Q4 {

    static {
        System.out.println("Static 1");
    }

    static {
        System.out.println("Static 2");
    }

    {
        System.out.println("Instance 1");
    }

    {
        System.out.println("Instance 2");
    }

    Q4() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Q4();
        new Q4();
    }
}
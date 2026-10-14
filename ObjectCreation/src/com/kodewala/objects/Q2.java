package com.kodewala.objects;

public class Q2 {

    static {
        System.out.println("A");
    }

    {
        System.out.println("B");
    }

    Q2() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Q2 obj1 = new Q2();
        Q2 obj2 = new Q2();
    }
}
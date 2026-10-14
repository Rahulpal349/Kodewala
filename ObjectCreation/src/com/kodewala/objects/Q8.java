package com.kodewala.objects;

class Parent {

    static {
        System.out.println("Parent Static");
    }

    {
        System.out.println("Parent Instance");
    }

    Parent() {
        System.out.println("Parent Constructor");
    }
}

public class Q8 extends Parent {

    static {
        System.out.println("Child Static");
    }

    {
        System.out.println("Child Instance");
    }

    Q8() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Q8();
        new Q8();
    }
}
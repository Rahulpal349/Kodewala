package com.kodewala.objects;

public class Q9 {

    static int a = 10;

    static {
        a = a + 5;
        System.out.println("S1: " + a);
    }

    static {
        a = a * 2;
        System.out.println("S2: " + a);
    }

    int b = 3;

    {
        b += 4;
        System.out.println("I1: " + b);
    }

    {
        b *= 2;
        System.out.println("I2: " + b);
    }

    Q9() {
        b += a;
        System.out.println("Constructor: " + b);
    }

    public static void main(String[] args) {
        new Q9();
        new Q9();
    }
}

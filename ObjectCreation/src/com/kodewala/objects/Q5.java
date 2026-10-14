package com.kodewala.objects;

public class Q5 {

    static int x = 10;
    int y = 20;

    static {
        x += 5;
        System.out.println(x);
    }

    {
        y += 10;
        System.out.println(y);
    }

    Q5() {
        x++;
        y++;
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        new Q5();
        new Q5();
    }
}
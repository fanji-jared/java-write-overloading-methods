package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("1+2=" + add(1, 2));
        System.out.println("1+2+3=" + add(1, 2, 3));
        System.out.println("1+2+3+4=" + add(1, 2, 3, 4));
        System.out.println("A+B+C=" + add("A", "B", "C"));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int a) {
        return x + y + a;
    }

    public static int add(int x, int y, int a, int b) {
        return x + y + a + b;
    }

    public static String add(String x, String y, String z) {
        return x + y + z;
    }
}

package org.example;

import static TriDepTrai.Calculator.divide;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(10, 20));
        sub(5,6);
        System.out.println(add(divide(20,2), divide(30,3)));
    }
    public static void sub(int a, int b){
        System.out.println(a-b);
    }
}
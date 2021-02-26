package com.company;

public class JdkTest {

    public static void main(String[] args) {

        Class<? extends String> c = "".getClass();
        System.out.println(c);
    }
}

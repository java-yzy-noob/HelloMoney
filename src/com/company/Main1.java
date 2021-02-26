package com.company;


import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(func(m, n));
    }

    private static int func(int m, int n) {
        if (n > m) {
            return func(m, m);
        }
        if (m == 0 || n == 1) {
            return 1;
        }
        return func(m, n - 1) + func(m - n, n);
    }

}

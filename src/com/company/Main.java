package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int input = sc.nextInt();
            display(input);
        }
        sc.close();
    }

    private static void display(int input){
        int mid = input >> 1;
        for (int i = mid; i >= 2; i--){
            if (isPr(i) && isPr(input - i)){
                System.out.println(i);
                System.out.println(input - i);
            }
        }
    }

    private static boolean isPr(int num){
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;

    }
}

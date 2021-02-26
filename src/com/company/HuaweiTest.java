package com.company;

import java.util.*;

public class HuaweiTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            System.out.println(solution(s));
        }
        sc.close();
    }



    private static String solution(String input){
        if (input == null || input.trim().length() == 0){
            return "-1";
        }
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : map.keySet()){
            if (map.get(c) == 1){
                return String.valueOf(c);
            }
        }
        return "-1";
    }
}

package com.programmers.level0;

public class Q27 {
    public static void main(String[] args) {
        String result = solution(  "BCBdbe",	"B");
        System.out.println(result);
    }

    public static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter,"");
    }
}
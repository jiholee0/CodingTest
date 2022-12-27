package com.programmers.level0;

public class Q039 {
    public static void main(String[] args) {
        String result = solution("bus");
        System.out.println(result);
    }

    public static String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
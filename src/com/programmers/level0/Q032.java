package com.programmers.level0;

import java.util.Arrays;

public class Q032 {
    public static void main(String[] args) {
        int result = solution("ppprrrogrammers","pppp");
        System.out.println(result);
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
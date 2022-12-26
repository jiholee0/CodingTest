package com.programmers.level0;

import java.util.Arrays;

public class Q30 {
    public static void main(String[] args) {
        String result = solution("hello", 3);
        System.out.println(result);
    }

    public static String solution(String my_string, int n) {
        String answer = "";
        for(char ch : my_string.toCharArray()){
            for(int cnt = 0;cnt < n;cnt++) answer += String.valueOf(ch);
        }
        return answer;
    }

    public static String solution2(String my_string, int n) {
        String answer = "";
        for(char ch : my_string.toCharArray()){
            answer += ch*3;
        }
        return answer;
    }
}
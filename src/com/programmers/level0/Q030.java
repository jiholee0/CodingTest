package com.programmers.level0;

public class Q030 {
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
}
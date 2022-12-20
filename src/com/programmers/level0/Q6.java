package com.programmers.level0;

public class Q6 {
    public static void main(String[] args) {
        int result = solution(40);
        System.out.println(result);
    }

    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}

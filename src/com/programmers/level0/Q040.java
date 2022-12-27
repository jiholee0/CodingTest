package com.programmers.level0;

public class Q040 {
    public static void main(String[] args) {
        int result = solution(999);
        System.out.println(result);
    }

    public static int solution(int hp) {
        int answer = 0;
        answer += hp/5;
        hp %= 5;
        answer += hp/3;
        hp %= 3;
        answer += hp;
        return answer;
    }
}
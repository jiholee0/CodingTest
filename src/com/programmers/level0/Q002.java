package com.programmers.level0;

public class Q002 {
    public static void main(String[] args) {
        int result = solution(10,5);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
}

package com.programmers.level0;

public class Q009 {
    public static void main(String[] args) {
        int result = solution(3,2);
        System.out.println(result);
    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        answer = (int)((float) num1 / num2 * 1000);
        return answer;
    }
}

package com.programmers.level0;

public class Q13 {
    public static void main(String[] args) {
        int result = solution(10, 3);
        System.out.println(result);
    }

    public static int solution(int n, int k) {
        int answer = 0;
        answer = 12000*n + 2000*(k-n/10);
        return answer;
    }
}
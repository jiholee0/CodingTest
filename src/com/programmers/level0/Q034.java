package com.programmers.level0;

public class Q034 {
    public static void main(String[] args) {
        int result = solution(976);
        System.out.println(result);
    }

    public static int solution(int n) {
        return  Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 2;
    }
}
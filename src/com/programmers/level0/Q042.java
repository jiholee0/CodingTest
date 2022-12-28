package com.programmers.level0;

public class Q042 {
    public static void main(String[] args) {
        int result = solution( 2,10);
        System.out.println(result);
    }

    public static int solution(int n, int t) {
        return (int) (n*Math.pow(2,t));
    }
}
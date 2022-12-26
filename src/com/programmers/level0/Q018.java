package com.programmers.level0;

public class Q018 {
    public static void main(String[] args) {
        int result = solution(7,10);
        System.out.println(result);
    }

    public static int solution(int slice, int n) {
        return n%slice == 0 ? n/slice : n/slice + 1;
    }
}
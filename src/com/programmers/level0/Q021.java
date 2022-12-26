package com.programmers.level0;

public class Q021 {
    public static void main(String[] args) {
        int result = solution(new int[]{2,4});
        System.out.println(result);
    }

    public static int solution(int[] dot) {
        return dot[0] > 0 ? (dot[1] > 0 ? 1 : 4) : (dot[1] > 0 ? 2 : 3);
    }
}
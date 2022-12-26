package com.programmers.level0;

import java.util.Arrays;

public class Q025 {
    public static void main(String[] args) {
        int[] result = solution(5500);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int money) {
        return new int[]{money/5500, money%5500};
    }
}
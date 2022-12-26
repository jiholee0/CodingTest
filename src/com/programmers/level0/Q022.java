package com.programmers.level0;

import java.util.Arrays;

public class Q022 {
    public static void main(String[] args) {
        int result = solution2(new int[]{199, 72, 222});
        System.out.println(result);
    }

    public static int solution(int[] sides) {
        return sides[0] < sides[1] + sides[2]
                && sides[1] < sides[0] + sides[2]
                && sides[2] < sides[0] + sides[1] ?
                1 : 2;
    }

    public static int solution2(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ?
                1 : 2;
    }
}
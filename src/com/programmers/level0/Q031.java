package com.programmers.level0;

import java.util.Arrays;

public class Q031 {
    public static void main(String[] args) {
        int result = solution(new int[]{1, 2, 7, 10, 11});
        System.out.println(result);
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
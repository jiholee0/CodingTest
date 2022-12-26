package com.programmers.level0;

import java.util.Arrays;

public class Q029 {
    public static void main(String[] args) {
        int result = solution(  new int[]{1, 2, 3, 4, 5});
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}
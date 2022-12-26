package com.programmers.level0;

import java.util.Arrays;

public class Q016 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int index = 0;
        for (int number:numbers){
            answer[index++] = number * 2;
        }
        return answer;
    }
}
package com.programmers.level0;

import java.util.Arrays;

public class Q024 {
    public static void main(String[] args) {
        int[] result = solution2(new int[]{1, 3, 5}, 1, 2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1]; int index=0;
        for (int i = 0; i < numbers.length; i++){
            if (i<num1) continue;
            if (i>num2) break;
            answer[index++] = numbers[i];
        }
        return answer;
    }

    public static int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers,num1,num2+1);
    }
}
package com.programmers.level0;

import java.util.Arrays;

public class Q015 {
    public static void main(String[] args) {
        int[] result = solution(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int index = num_list.length-1;
        for (int number:num_list){
            answer[index--] = number;
        }
        return answer;
    }
}
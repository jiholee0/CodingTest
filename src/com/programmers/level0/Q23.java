package com.programmers.level0;

import java.util.Arrays;

public class Q23 {
    public static void main(String[] args) {
        int[] result = solution2(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for (int number : num_list){
            if (number%2==0) answer[0]+=1;
            else answer[1]+=1;
        }
        return answer;
    }

    public static int[] solution2(int[] num_list) {
        int[] answer = new int[2];
        for (int number : num_list){
            answer[number%2]++;
        }
        return answer;
    }

}
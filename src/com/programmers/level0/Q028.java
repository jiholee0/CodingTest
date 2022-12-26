package com.programmers.level0;

import java.util.Arrays;

public class Q028 {
    public static void main(String[] args) {
        int[] result = solution(  10);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n) {
        int[] answer = new int[n/2 + (n%2==0?0:1)]; int index = 0;
        for (int i=1;i<=n-(n%2==0?1:0);i+=2) {
            answer[index++] = i;
        }
        return answer;
    }
}
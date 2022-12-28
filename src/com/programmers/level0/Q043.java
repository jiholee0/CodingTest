package com.programmers.level0;

import java.util.*;

public class Q043 {
    public static void main(String[] args) {
        int[] result = solution( 3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int num:numlist){
            if(num%n==0) list.add(num);
        }
        int[] answer = new int[list.size()]; int cnt=0;
        for (int num:list){
            answer[cnt++] = num;
        }
        return answer;
    }
}
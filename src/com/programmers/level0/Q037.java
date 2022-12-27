package com.programmers.level0;

import java.util.Arrays;
import java.util.List;

public class Q037 {
    public static void main(String[] args) {
        int result = solution(1);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=1;i<=Math.floor(Math.sqrt(n));i++){
            answer = (float) n/i == (int) n/i ? answer+1 :answer;
        }
        answer = Math.sqrt(n) == (int) Math.sqrt(n) ? answer*2-1: answer*2;
        return answer;
    }
}
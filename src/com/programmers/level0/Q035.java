package com.programmers.level0;

import java.util.Arrays;
import java.util.List;

public class Q035 {
    public static void main(String[] args) {
        int result = solution(1234);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i = 100000 ; i >= 1 ; i/=10) {
            answer += n/i; n -= n/i *i;
        }
        return answer;
    }
}
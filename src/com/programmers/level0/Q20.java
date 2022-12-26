package com.programmers.level0;

import java.util.Arrays;

public class Q20 {
    public static void main(String[] args) {
        int result = solution(15);
        System.out.println(result);
    }

    public static int solution(int n) {
        return n/7+(n%7==0?0:1);
    }
}
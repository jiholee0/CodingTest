package com.programmers.level0;

public class Q010 {
    public static void main(String[] args) {
        int result = solution(10);
        System.out.println(result);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = n % 2 == 0? n : n-1; i>0; i-=2){
            answer += i;
        }
        return answer;
    }
}

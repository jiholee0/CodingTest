package com.programmers.level0;

public class Q012 {
    public static void main(String[] args) {
        int result = solution(new int[]{1, 1, 2, 3, 4, 5},1);
        System.out.println(result);
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int item : array){
            answer = item == n? answer+1 : answer;
        }
        return answer;
    }
}

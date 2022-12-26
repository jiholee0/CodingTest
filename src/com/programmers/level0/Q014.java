package com.programmers.level0;

public class Q014 {
    public static void main(String[] args) {
        int result = solution(new int[]{149, 180, 192, 170}, 167);
        System.out.println(result);
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int item : array){
            answer = item > height? answer + 1 : answer;
        }
        return answer;
    }
}
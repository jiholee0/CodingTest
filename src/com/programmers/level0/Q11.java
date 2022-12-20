package com.programmers.level0;

public class Q11 {
    public static void main(String[] args) {
        double result = solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println(result);
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        answer = answer/numbers.length;
        return answer;
    }
}

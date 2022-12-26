package com.programmers.level0;

public class Q008 {
    public static void main(String[] args) {
        int result = solution(180);
        System.out.println(result);
    }

    public static int solution(int angle) {
        int answer = 0;
        /*answer = angle < 90 ? 1 : 3;
        if (angle == 90) answer = 2;
        if (angle == 180) answer = 4;*/

        // 다른 사람 풀이 보고 힌트 얻음
        answer = angle == 180? 4 : angle == 90? 2 : angle < 90? 1 : 3;
        return answer;
    }
}

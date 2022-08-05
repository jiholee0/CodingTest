package com.company;

public class 최소직사각형 {
    // 문제 풀이 로직
    /*
    * 최대 길이를 찾는다.
    * 다른 명함들 중 가로/세로가 모두 최대 길이의 짝꿍보다 긴 경우 둘 중에 더 작은 길이를 another에 저장한다.
    * answer = max * another
    */

    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int result = solution(sizes);
        System.out.println(result);
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int another = 0;
        int index = 0;

        // 최대 길이를 찾는다.
        for(int i = 0;i<sizes.length;i++){
            if(sizes[i][0]>max) {max = sizes[i][0]; another = sizes[i][1]; index = i;}
            if(sizes[i][1]>max) {max = sizes[i][1]; another = sizes[i][0]; index = i;}
        }

        // another를 찾는다.
        for(int i = 0;i<sizes.length;i++){
            if(i==index) continue;
            if(sizes[i][0]>another && sizes[i][1]>another) {
                another = Math.min(sizes[i][0], sizes[i][1]);
            }
        }

        // 답 = max * another
        answer = max * another;
        return answer;
    }
}

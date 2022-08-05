package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class 피로도 {
    // 문제 풀이 로직
    /*
     * 던전 수가 최대 8이므로 모든 경우를 다 체크.
     * */

    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int result = solution(80, dungeons);
        System.out.println(result);
    }

    public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        int size = dungeons.length;

        ArrayList<ArrayList<Integer>> result; // 모든 순열

        return answer;
    }
}

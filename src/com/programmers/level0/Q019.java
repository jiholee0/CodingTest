package com.programmers.level0;

import java.util.Arrays;

public class Q019 {
    public static void main(String[] args) {
        int[] result = solution(new String[]{"We", "are", "the", "world!"});
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; int index = 0;
        for (String str : strlist){
            answer[index++]= str.length();
        }
        return answer;
    }
}
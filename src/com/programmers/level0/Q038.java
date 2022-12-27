package com.programmers.level0;

import java.util.Arrays;
import java.util.List;

public class Q038 {
    public static void main(String[] args) {
        int result = solution("1a2b3c4d123");
        System.out.println(result);
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] list = my_string.split("");
        for(String str : list){
            answer += str.matches("[0-9]")?Integer.parseInt(str):0;
        }
        return answer;
    }
}
package com.programmers.level0;

import java.util.Arrays;
import java.util.List;

public class Q036 {
    public static void main(String[] args) {
        int result = solution(new String[]{"a", "b", "c"}, new String[]{"com", "b", "d", "p", "c"});
        System.out.println(result);
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        List<String> l1 = Arrays.asList(s1);
        for(String str:s2){
            answer = l1.contains(str) ? answer+1:answer;
        }
        return answer;
    }
}
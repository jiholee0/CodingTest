package com.programmers.level0;

public class Q041 {
    public static void main(String[] args) {
        String result = solution( "cccCCC");
        System.out.println(result);
    }

    public static String solution(String my_string) {
        String answer="";
        for(char c:my_string.toCharArray()){
           answer+= c > 64 && c < 91 ? (char) (c + 32) : (char) (c - 32);
        }
        return answer;
    }
}
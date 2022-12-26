package com.programmers.level0;

public class Q026 {
    public static void main(String[] args) {
        int result = solution( "I love you~");
        System.out.println(result);
    }

    public static int solution(String message) {
        return message.length()*2;
    }
}
package com.programmers.level0;

public class Q033 {
    public static void main(String[] args) {
        int result = solution(150000);
        System.out.println(result);
    }

    public static int solution(int price) {
        return (int) (price >= 500000 ? Math.floor(price*0.8) :
                      price >= 300000 ? Math.floor(price*0.9) :
                      price >= 100000 ? Math.floor(price*0.95) : price);
    }
}
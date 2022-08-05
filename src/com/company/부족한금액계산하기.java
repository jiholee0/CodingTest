package com.company;

public class 부족한금액계산하기 {
    // 문제 풀이 로직
    /*
    * 전체 금액을 계산한다.
    * 가진 돈과 금액을 비교한다.
    */

    public static void main(String[] args) {
        long result = solution(3,40,4);
        System.out.println(result);
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long total_price = 0;
        for(int i = 1; i<=count;i++){
            total_price += price*i;
            System.out.println(total_price);
        }
        answer = (money >= total_price)? (long) 0: total_price-money;
        return answer;
    }
}


package com.programmers.level0;

import java.util.*;

public class Q044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int cnt=1;cnt<=n;cnt++){
            char ch = '*';
            String str= ch.repeat(cnt);

            System.out.print(str);
        }
        System.out.println(n);
    }
}
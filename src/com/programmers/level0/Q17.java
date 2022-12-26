package com.programmers.level0;

import java.util.*;

public class Q17 {
    public static void main(String[] args) {
        String result = solution2("jaron");
        System.out.println(result);
    }

    public static String solution(String my_string) {
        List<String> list = new ArrayList<>(Arrays.asList(my_string.split("")));
        Collections.reverse(list);
        return String.join("",list);
    }

    public static String solution2(String my_string) {
        StringBuffer sb = new StringBuffer(my_string).reverse();
        return sb.toString();
    }
}
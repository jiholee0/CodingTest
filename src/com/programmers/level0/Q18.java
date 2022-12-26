package com.programmers.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q18 {
    public static void main(String[] args) {
        int result = solution(7,10);
        System.out.println(result);
    }

    public static int solution(int slice, int n) {
        return n%slice == 0 ? n/slice : n/slice + 1;
    }
}
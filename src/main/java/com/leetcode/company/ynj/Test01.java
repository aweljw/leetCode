package com.leetcode.company.ynj;

import java.util.Arrays;
import java.util.Collections;

public class Test01 {
  public static void main(String[] args) {
    int essence = 213;
    System.out.println(solution(essence));
  }


  public static int solution(int N) {
    String result = "";
    final String s = String.valueOf(N);
    Integer[] intArray = new Integer[s.length()];

    for (int i = 0; i < s.length(); i++) {
      intArray[i] = Integer.valueOf(s.substring(i, i + 1));
    }

    Arrays.sort(intArray, Collections.reverseOrder());

    for (int i = 0; i < intArray.length; i++) {
      result = result + intArray[i];
    }

    return Integer.valueOf(result);
  }
}

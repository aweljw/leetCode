package com.leetcode.company.sendbird;

import java.util.Arrays;

public class Test01 {
  private static String AB = "AB";
  private static String BA = "BA";
  private static String CD = "CD";
  private static String DC = "DC";

  public static void main(String[] args) {
    System.out.println(solution("CBACD"));
    System.out.println(solution("CABABD"));
    System.out.println(solution("ACBDACBD"));
  }

  public static String solution(String S) {
    String result1 = getString(S, AB);
    if (result1 != null) return result1;

    String result2 = getString(S, BA);
    if (result2 != null) return result2;

    String result3 = getString(S, CD);
    if (result3 != null) return result3;

    String result4 = getString(S, DC);
    if (result4 != null) return result4;

    return S;
  }

  private static String getString(
      final String S,
      final String checkStr) {
    if (S.indexOf(checkStr) > -1) {
      final int indexOf = S.indexOf(checkStr);
      String result = "";

      for (int i = 0; i < S.length(); i++) {
        if (!(i == indexOf || i == indexOf + 1)) {
          result = result + S.substring(i, i + 1);
        }
      }

      return solution(result);
    }

    return null;
  }
}

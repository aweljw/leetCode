package com.leetcode.company.ynj;

public class Test04 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{13, 7, 2, 8, 3}));
    System.out.println(solution(new int[]{1, 2, 4, 8}));
    System.out.println(solution(new int[]{16, 16}));
  }

  public static int solution(int[] A) {
    int result = 0;
    String binaryTotalShift = null;

    for (int i = 0; i < A.length; i++) {
      if (binaryTotalShift != null) {
        final int intValue = Integer.parseInt(binaryTotalShift, 2);
        binaryTotalShift = Integer.toBinaryString(A[i] & intValue);
      } else {
        binaryTotalShift = Integer.toBinaryString(A[i]);
      }
    }

    if (Integer.parseInt(binaryTotalShift, 2) == 16) {
      return A.length;
    }

    for (int i = 0; i < A.length; i++) {
      final String binaryStr = Integer.toBinaryString(A[i]);
      int lastNumber =
          Integer.parseInt(binaryStr.substring(binaryStr.length() - 1, binaryStr.length()));
      if (lastNumber == 1) {
        result++;
      }
    }

    return result;
  }
}

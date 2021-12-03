package com.leetcode.company.cp;

public class Test01 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{5, 3, 9, 13}, 8));
    System.out.println(solution(new int[]{5, 3, 9, 13}, 7));
  }

  public static boolean solution(
      int[] arr,
      int n) {
    boolean answer = false;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == n) {
          answer = true;
        }
      }
    }

    return answer;
  }
}

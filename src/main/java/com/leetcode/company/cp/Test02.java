package com.leetcode.company.cp;

public class Test02 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 20));
  }

  public static int solution(
      int[] A,
      int S) {
    int answer = -1;
    for (int i = 0; i < A.length; i++) {
      int sum = A[i];
      for (int j = i + 1; j < A.length; j++) {
        sum = sum + A[j];
        if (sum == 20) {
          answer = j - i + 1;
        } else if (sum > 20) {
          break;
        }
      }
    }

    return answer;
  }
}

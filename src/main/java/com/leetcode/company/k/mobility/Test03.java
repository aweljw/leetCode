package com.leetcode.company.k.mobility;

public class Test03 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{3, 2, 3, 2, 3}));
    System.out.println(solution(new int[]{7, 4, -2, 4, -2, 9}));
    System.out.println(solution(new int[]{7, -5, -5, -5, 7, -1, 7}));
    System.out.println(solution(new int[]{4}));
    System.out.println(solution(new int[]{7, 4, -2, 4, 9, 9, 9, 9, 9}));
    System.out.println(solution(new int[]{7, 4, -2, 4, 1, 9, 1, 9, 1, 9, 1}));
    System.out.println(solution(new int[]{7, 4, -2, 7, 3, 1, 2, 6, 9, 2}));
  }

  public static int solution(int[] A) {
    int a = solution2(A);
    int[] tmp = new int[A.length - 1];
    for (int i = 0; i <= tmp.length - 1; i++) {
      tmp[i] = A[i + 1];
    }
    int b = solution2(tmp);

    if (a > b) return a;
    return b;
  }

  public static int solution2(int[] A) {
    if (A.length < 3) {
      return A.length;
    }

    int i = 0;
    int j = 1;
    int start;
    int max = 1;
    while (j + 2 < A.length) {
      start = i;
      while (i + 2 < A.length && j + 2 < A.length && A[i] == A[i + 2] && A[j] == A[j + 2]) {
        i += 2;
        j += 2;
      }
      if (j + 2 < A.length) {
        if (A[j] == A[j + 2] && A[i] == A[i + 1]) {
          if (max < j + 2 - start) {
            max = j + 2 - start;
          }
        }
      }
      if (i + 2 < A.length) {
        if (A[i] == A[i + 2]) {
          if (max < i + 2 - start) {
            max = i + 2 - start;
          }
        }
      }
      if (max < j - start) {
        max = j - start;
      }
      i += 2;
      j += 2;
    }
    return max + 1;
  }

}




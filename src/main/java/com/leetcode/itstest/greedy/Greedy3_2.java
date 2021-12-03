package com.leetcode.itstest.greedy;

import java.util.Arrays;

public class Greedy3_2 {
  public static void main(String[] args) {
    /**
     * 큰 수의 법칙.
     * 순서대로 2, 4, 5, ,4 ,6으로 이루어진 배열이 있을 때 M이 8이고 K가 3이라고 가정하자.
     * 모든 합이 가장 크도록 M만큼 더하고 연속된 숫자는 K만큼만 허용하도록 하였을 때 최대 값을 구하여라.
     */
    System.out.println(solution(new int[]{2, 4, 5, 4, 6}, 8, 3));
  }

  public static int solution(
      int[] array,
      int M,
      int K) {
    Arrays.sort(array);
    int first = array[array.length - 1];
    int second = array[array.length - 2];

    // 가장 큰 수가 더해지는 횟수 계산
    // 연속 가능한 숫자만큼 더하고 다른 숫자로 더한 값이 1
    int cnt = (M / (K + 1)) * K;
    cnt += M % (K + 1);

    int result = 0;
    result += cnt * first;        //가장 큰 수 더하기
    result += (M - cnt) * second; //두번째로 큰 수 더하기

    return result;
  }
}

package com.leetcode.easy.two_sum;

import java.util.Arrays;

// Brute Force
public class Approach01 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    twoSum(new int[]{3, 2, 4}, 6);
    long end = System.currentTimeMillis();

    System.out.println("start : " + start); //시작시간의 밀리세컨드
    System.out.println("end : " + end);  //종료시간의 밀리케선드
    System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간
  }

  static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] == target - nums[i]) {
          System.out.println(Arrays.toString(new int[] { i, j }));
          return new int[] { i, j };
        }
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

package com.leetcode.leetcode.easy.two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Two-pass Hash Table
public class Approach02 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    twoSum(new int[]{3, 2, 4}, 6);
    long end = System.currentTimeMillis();

    System.out.println("start : " + start); //시작시간의 밀리세컨드
    System.out.println("end : " + end);  //종료시간의 밀리케선드
    System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초"); //최종 실행시간
  }

  static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement) && map.get(complement) != i) {
        System.out.println(Arrays.toString(new int[] { i, map.get(complement) }));
        return new int[] { i, map.get(complement) };
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

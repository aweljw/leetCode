package com.leetcode.programmers.kit.hash.camouflage;

import java.util.HashMap;
import java.util.Map;

class Approach01 {
  public static void main(String[] args) {
    //test01
    String[][] clothes =
        {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

    //test02
    /*String[][] clothes =
        {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};*/

    solution(clothes);
  }

  static int solution(String[][] clothes) {
    int answer = 1;
    Map<String, Integer> items = new HashMap<>();
    for (String[] entry : clothes) {
      items.put(entry[1], items.getOrDefault(entry[1], 0) + 1);
    }
    for(int value : items.values()) {
      answer *= value + 1;
    }

    System.out.println(answer - 1);
    return answer - 1;
  }
}

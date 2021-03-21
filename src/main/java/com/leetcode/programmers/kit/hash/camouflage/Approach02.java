package com.leetcode.programmers.kit.hash.camouflage;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.reducing;

import java.util.Arrays;

public class Approach02 {
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
    return Arrays.stream(clothes)
        .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
        .values()
        .stream()
        .collect(reducing(1L, (x, y) -> x * (y + 1)))
        .intValue() - 1;
  }
}

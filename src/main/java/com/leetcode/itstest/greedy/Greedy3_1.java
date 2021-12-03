package com.leetcode.itstest.greedy;

public class Greedy3_1 {
  public static void main(String[] args) {
    /**
     * 카운터에는 거스름돈으로 사용할 동전이 500원, 100원, 50원, 10원이 무한히 존재하고
     * 손님에게 거슬러 줘야할 돈이 N원일 때, 거슬러 줘야할 동전의 최소 개수를 구하라.
     */
    System.out.println(solution(new int[]{500, 100, 50, 10}, 1260));
  }

  public static int solution(
      int[] coinTypes,
      int n) {
    int cnt = 0;

    for (int i = 0; i < coinTypes.length; i++) {
      int coin = coinTypes[i];
      cnt += n / coin;
      n %= coin;
    }

    return cnt;
  }
}

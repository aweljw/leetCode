package com.leetcode.itstest.greedy;

public class Greedy3_4 {
  public static void main(String[] args) {

    /**
     * 가장 높은 숫자의 카드를 뽑아라. 다만 아래의 룰을 지키며 뽑아야한다.
     *
     * 1. 숫자는 N(행) x M(열)의 형태로 놓여 있다.
     * 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
     * 3. 선택된 행에 포함된 카드들 중 가장 낮은 숫자가 낮은 카드를 뽑는다.
     */
    System.out.println(solution(new int[][]{{3, 1, 2}, {4, 1, 4}, {2, 2, 2}}));
    System.out.println(solution(new int[][]{{7, 3, 1, 8}, {3, 3, 3, 4}}));
  }

  public static int solution(int[][] array) {
    int maxValue = 0;

    for (int i = 0; i < array.length; i++) {
      int minValue = 10000;

      for (int j = 0; j < array.length; j++) {
        minValue = Math.min(minValue, array[i][j]);
      }
      maxValue = Math.max(minValue, maxValue);
    }

    return maxValue;
  }
}

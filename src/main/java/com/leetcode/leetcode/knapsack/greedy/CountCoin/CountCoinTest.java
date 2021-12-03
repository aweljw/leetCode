package com.leetcode.leetcode.knapsack.greedy.CountCoin;

import java.util.Arrays;

public class CountCoinTest {
  public static void main(String[] args) {
    int amount = 4830;
    int[] coins = {10, 100, 50, 500};
    System.out.println(countCoin(amount, coins));
  }

  private static String countCoin(
      int amount,
      int[] coinArr) {
    final int[] sortCoinArr = sort(coinArr);
    System.out.println("---");

    return "";
  }

  public static int[] sort(int[] input) {
    int[] arr = input;
    int size = input.length;

    boolean swaped;

    for(int i = 0; i < size-1 ; i++) {
      swaped = false;

      for (int j = 0; j < size-1-i; j++) {
        if(arr[j] < arr [j+1] ) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          swaped=true;
        }
      }

      Arrays.sort(input);

      if (swaped == false) {
        break;
      }

    }
    return  arr;
  }
}

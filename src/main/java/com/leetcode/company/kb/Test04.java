package com.leetcode.company.kb;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
  public static void main(String[] args) {
    int[] arr = {1, 1, 3, 3, 2, 2, 4, 5, 1, 1, 1, 3, 3, 3};
    solution(arr);
  }

  static int solution(int[] arr) {
    int count = 0;
    int[] reqArray = arr;

    while (count < 100) {
      count++;
      int[] result = sameValue(reqArray);
      if (result.length == 1 && result[0] == 1) {
        break;
      } else {
        reqArray = result;
      }
    }

    return count;
  }


  private static int[] sameValue(int[] arr) {
    int check = 0;
    int sameValue = 0;
    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < arr.length; i++) {
      if (check != 0 && sameValue != arr[i]) {
        list.add(check);
        check = 1;
        sameValue = arr[i];

        if (i + 1 == arr.length) {
          list.add(check);
        }
        continue;
      }

      sameValue = arr[i];
      check++;
      if (i + 1 == arr.length) {
        list.add(check);
      }
    }

    int result[] = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      result[i] = list.get(i);
    }

    return result;
  }
}

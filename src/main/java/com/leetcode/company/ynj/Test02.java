package com.leetcode.company.ynj;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test02 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{5, 3, 6, 1, 3}, 2));
    System.out.println(solution(new int[]{8, 8, 4, 3}, 2));
    System.out.println(solution(new int[]{3, 5, 1, 3, 9, 8}, 4));
  }

  public static int solution(
      int[] A,
      int K) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    Integer consecutiveNumbers = null;
    boolean deleteCheck = false;
    int count = 0;
    String resultStr = "";

    for (int i = 0; i < A.length; i++) {
      map.merge(A[i], 1, Integer::sum);
    }

    for (Integer key : map.keySet()) {
      //System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));

      if (map.get(key) > 1) {
        consecutiveNumbers = key;
        break;
      }
    }

    boolean isContinuous = false;

    for (Integer key : map.keySet()) {
      if (map.get(key) >= K) {
        isContinuous = true;
      }
    }

    if (!isContinuous) {
      return 1;
    }

    for (int i = 0; i < A.length; i++) {
      if (count >= K) {
        //break;
      }

      if (deleteCheck) {
        if (A[i] == consecutiveNumbers) {
          //System.out.println("같으니깐 삭제하지마" + A[i]);
          resultStr = resultStr + A[i];
        } else {
          //System.out.println("여기부터 삭제해" + A[i]);
          count++;
        }
      } else {
        if (A[i] == consecutiveNumbers) {
          resultStr = resultStr + A[i];
          deleteCheck = true;
        } else {
          resultStr = resultStr + A[i];
        }
      }
    }

    //System.out.println("count:" + count);
    //System.out.println("result:" + resultStr);

    boolean checkttt = false;
    int checkCo = 0;

    for (int i = 0; i < A.length; i++) {
      //System.out.println(i + ": " + A[i]);
      if (checkttt) {
        if (consecutiveNumbers == A[i]) {
          break;
        } else {
          checkCo++;
        }
      } else {
        if (consecutiveNumbers == A[i]) {
          checkttt = true;
        }
      }
    }

    return checkCo;
  }
}

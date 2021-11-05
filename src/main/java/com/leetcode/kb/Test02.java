package com.leetcode.kb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
  public static void main(String[] args) {
    String[] reqs =
        {"DEPOSIT 3a 10000", "CREATE 3a 300000", "WITHDRAW 3a 150000", "WITHDRAW 3a 150001"};
    /*String[] reqs =
        {"CREATE 3a 10000", "CREATE 3a 20000", "CREATE 2bw 30000"};*/
    solution(reqs);
  }

  static int[] solution(String[] reqs) {
    Map<String, int[]> map = new HashMap<>();
    int[] result = new int[reqs.length];

    for (int i = 0; i < reqs.length; i++) {
      String[] req = reqs[i].split(" ");

      if (req[0].equals("CREATE")) {
        if (map.get(req[1]) != null) {
          result[i] = 403;
          continue;
        }

        map.put(req[1], new int[] {0, -Integer.parseInt(req[2])});
        result[i] = 200;
      } else if (req[0].equals("DEPOSIT")) {
        if (map.get(req[1]) == null) {
          result[i] = 404;
          continue;
        }

        int[] prices = map.get(req[1]);
        prices[0] = prices[0] + Integer.parseInt(req[2]);
        map.put(req[1], prices);
        result[i] = 200;
      } else if (req[0].equals("WITHDRAW")) {
        if (map.get(req[1]) == null) {
          result[i] = 404;
          continue;
        }

        int[] prices = map.get(req[1]);
        if(prices[0] - Integer.parseInt(req[2]) < prices[1]) {
          result[i] = 403;
          continue;
        }
        prices[0] = prices[0] - Integer.parseInt(req[2]);
        map.put(req[1], prices);
        result[i] = 200;
      }
    }

    System.out.println(String.valueOf(map));
    System.out.println(Arrays.toString(result));
    return result;
  }
}

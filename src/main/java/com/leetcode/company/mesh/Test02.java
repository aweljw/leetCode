package com.leetcode.company.mesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test02 {
  public static void main(String[] args) {
    int threshold = 2;
    List<String> logs = Arrays.asList("1 2 50", "1 7 20", "1 3 50", "22 2 30");

    System.out.println("result:" + processLogs(logs, threshold));
    //processLogs(logs, threshold);
  }

  public static List<String> processLogs(
      List<String> logs,
      int threshold) {
    HashMap<String, Integer> map = new HashMap<>();
    List<String> result = new ArrayList<>();

    for (int i = 0; i < logs.size(); i++) {
      String log = logs.get(i);
      String[] s = log.split(" ");
      String senderUser = s[0];
      String recipientUser = s[1];

      if (Integer.valueOf(senderUser) == Integer.valueOf(recipientUser)) {
        map.merge(senderUser, 1, Integer::sum);
        continue;
      }

      map.merge(senderUser, 1, Integer::sum);
      map.merge(recipientUser, 1, Integer::sum);
    }

    map.forEach((key, value) -> {
      if (value >= threshold) {
        result.add(key);
      }
    });
    System.out.println("map: " + map);
    System.out.println("result: " + result);

    return result;
  }
}

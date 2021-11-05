package com.leetcode.company.mesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test03 {
  public static void main(String[] args) {
    int threshold = 2;
    List<String> logs = Arrays.asList("88 99 200", "88 99 300", "99 32 100", "12 12 15");

    System.out.println("result:" + processLogs(logs, threshold));
    //processLogs(logs, threshold);
  }

  public static List<String> processLogs(
      List<String> logs, int threshold) {
    Map<String, Integer> map = new HashMap();
    List<String> result = new ArrayList();

    for(int i = 0; i < logs.size(); i++) {
      String log = logs.get(i);
      String[] s = log.split(" ");
      String senderUser = s[0];
      String recipientUser = s[1];

      if (Integer.valueOf(senderUser) == Integer.valueOf(recipientUser)) {
        if (map.get(String.valueOf(senderUser)) != null) {
          map.put(String.valueOf(senderUser), map.get(String.valueOf(senderUser)) + 1);
        } else {
          map.put(String.valueOf(senderUser), 1);
        }

        continue;
      }

      if (map.get(String.valueOf(senderUser)) != null) {
        map.put(String.valueOf(senderUser), map.get(String.valueOf(senderUser)) + 1);
      } else {
        map.put(String.valueOf(senderUser), 1);
      }

      map.merge(String.valueOf(recipientUser), 1, Integer::sum);

      System.out.println(i + " " + senderUser  + " " +  recipientUser);
    }

    map.forEach((key, value) ->{
      if (value >= threshold) {
        result.add(key);
      }
    });

    System.out.println("map:" + map);
    return result;
  }
}

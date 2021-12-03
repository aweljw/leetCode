package com.leetcode.company.cp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test03 {
  public static void main(String[] args) {

    System.out.println(solution(
        new String[]{"DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F",
            "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"}));
  }

  public static String[] solution(String[] grades) {
    Map<String, String> map = new HashMap<>();
    ArrayList<String> list = new ArrayList<>();

    for (String grade : grades) {
      final String[] s = grade.split(" ");
      System.out.println(s[0] + " " + s[1]);

      if (map.get(s[0]) == null) {
        map.put(s[0], s[1]);
      } else {
        //System.out.println(s[0] + " " + s[1]);
        final char oldGrade = map.get(s[0])
            .charAt(0);
        final char newGrade = s[1].charAt(0);

        if (Character.compare(newGrade, oldGrade) < 0) {
          map.put(s[0], s[1]);
        } else if (newGrade == oldGrade) {
          final int subOldGrade = subGradeConvert(map.get(s[0])
              .substring(1, 2));
          final int subNewGrade = subGradeConvert(s[1].substring(1, 2));
          if (subOldGrade > subNewGrade) {
            map.put(s[0], s[1]);
          }
        }
      }
    }

    for (String key : map.keySet()) {
      list.add(map.get(key) + " " + key);
    }

    list.sort(String::compareTo);

    String[] answer = new String[list.size()];
    for (int i = 0; i < list.size(); i++) {
      final String str = list.get(i);
      final String[] strArray = str.split(" ");

      answer[i] = strArray[1] + " " + strArray[0];
    }

    return answer;
  }

  public static int subGradeConvert(String str) {
    if ("+".equals(str)) {
      return 1;
    } else if ("0".equals(str)) {
      return 2;
    } else {
      return 3;
    }
  }
}

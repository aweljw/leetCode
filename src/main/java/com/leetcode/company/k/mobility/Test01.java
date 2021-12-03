package com.leetcode.company.k.mobility;

import java.util.HashMap;

public class Test01 {
  public static void main(String[] args) {
    String param01 =
        "John Doe, Peter Parker, Mary Jane Watson-Parker, James Doe, John Elvis Doe, Jane Doe, " +
            "Penny Parker";
    String param02 = "Example";

    System.out.println(solution(param01, param02));
  }

  public static String solution(
      String S,
      String C) {
    String reuslt = "";
    final HashMap<String, Integer> map = new HashMap<>();
    final String company = "@" + C.toLowerCase() + ".com";

    final String[] splitStr = S.split(", ");

    for (String str : splitStr) {
      final String[] nameSplit = str.split(" ");
      final String first = nameSplit[0].substring(0, 1).replace("-", "")
          .toLowerCase();
      String middle = "";
      String last;

      if (nameSplit.length > 2) {
        middle = nameSplit[1].substring(0, 1).toLowerCase().replace("-", "");
        last = nameSplit[2].toLowerCase().replace("-", "");
      } else {
        last = nameSplit[1].toLowerCase().replace("-", "");
      }

      if (last.length() > 8) {
        last = last.substring(0, 8).toLowerCase();
      }

      String email = first + middle + last;

      if (map.get(email) == null) {
        map.put(email, 1);
        email = first + middle + last + company;
      } else {
        map.put(email, map.get(email) + 1);
        email = first + middle + last + map.get(email) + company;
      }

      reuslt = reuslt + str + " <" + email + ">, ";
    }

    return reuslt.substring(0, reuslt.length() - 2);
  }
}

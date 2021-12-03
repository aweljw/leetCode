package com.leetcode.company.ynj;

public class Test03 {
  public static void main(String[] args) {
    System.out.println(solution(19));
  }

  public static int solution(int N) {
    String result = "";

    for(int i=1; i<3; i++) {
      String str = "";
      str = String.valueOf(i);
      int intValue = N - i;

      int loop = 9;

      do{
        if (intValue - loop > 0) {
          str = str + String.valueOf(loop);
          intValue = intValue - loop;
        } else {
          System.out.println("");
          str = str + String.valueOf(loop);
          intValue = intValue - loop;
        }
      }while(intValue > 0);

      result = result + str + ",";
    }

    return 0;
  }
}

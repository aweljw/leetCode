package com.leetcode.wb.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test04 {
  public static void main(String[] args) {
    System.out.println("test04!!!");

    String[] beforeArray  = {"A", "B", "C"};
    String[] afterArray  = {"B", "C", "A"};
    HashMap <Integer, String> beforeMap = new HashMap<>();
    HashMap <Integer, String> afterMap = new HashMap<>();
    HashMap <Integer, String> resultMap = new HashMap<>();

    for(int i = 0; i < beforeArray.length; i++) {
      beforeMap.put(i, beforeArray[i]);
    }
    for(int i = 0; i < beforeArray.length; i++) {
      afterMap.put(i, afterArray[i]);
    }

    System.out.println("시작");
    System.out.println(beforeMap);
    System.out.println(afterMap);

    for(var beforeKey : beforeMap.keySet()) {
      boolean exist = true;

      for(var afterKey : afterMap.keySet()) {
        if(beforeMap.get(afterKey) == afterMap.get(afterKey)) {
          exist = true;
        }
      }

      if(exist) {

      } else {

      }
    }

    /*for(var key : afterMap.keySet()) {
      if(beforeMap.get(key) != null) {
        beforeMap.put("temp", beforeMap.get(key));
      }
    }*/

    System.out.println("끝");
    System.out.println(beforeMap);
    System.out.println(afterMap);

  }
}

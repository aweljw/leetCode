package com.leetcode.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test01 {
  public static void main(String[] args) {
    Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
    for (int number : findUniqueNumbers(numbers))
      System.out.println(number);
  }

  public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
    Map<Integer, Boolean> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for (Integer i : numbers) {
      if (map.get(i) == null) {
        map.put(i, true);
      } else {
        map.put(i, false);
      }
    }

    Iterator<Integer> keys = map.keySet().iterator();
    while(keys.hasNext()){
      Integer key = keys.next();
      if(map.get(key)) {
        list.add(key);
      }
    }

    return list;
  }
}

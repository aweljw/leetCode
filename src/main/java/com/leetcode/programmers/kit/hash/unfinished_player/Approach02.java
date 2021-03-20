package com.leetcode.programmers.kit.hash.unfinished_player;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Approach02 {
  public static void main(String[] args) {
    //test01
    String[] participant = {"leo", "kiki", "eden"};
    String[] completion = {"eden", "kiki"};

    //test02
    //String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    //String[] completion = {"josipa", "filipa", "marina", "nikola"};

    //test03
    //String[] participant = {"mislav", "stanko", "mislav", "ana"};
    //String[] completion = {"stanko", "ana", "mislav"};

    solution(participant, completion);
  }

  static String solution(String[] participant, String[] completion) {

    Map<String, Long> participantMap = Arrays.asList(participant).stream()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    for(String name : completion) {

      Long value = participantMap.get(name) - 1L;

      if(value == 0L) {
        participantMap.remove(name);
      } else {
        participantMap.put(name, value);
      }
    }

    return participantMap.keySet().iterator().next();
  }
}

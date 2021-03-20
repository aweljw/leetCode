package com.leetcode.programmers.kit.hash.unfinished_player;

import java.util.HashMap;

class Approach01 {
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
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
    for (String player : completion) hm.put(player, hm.get(player) - 1);

    for (String key : hm.keySet()) {
      if (hm.get(key) != 0){
        answer = key;
      }
    }

    System.out.println("result: " + answer);
    return answer;
  }
}

package com.leetcode.programmers.kit.stack_queue.bridge_passing_truck;

import java.util.LinkedList;
import java.util.Queue;

public class Approach01 {
  public static void main(String[] args) {

    // test01
    int bridge_length = 2;
    int weight = 10;
    int[] truck_weights = {7,4,5,6};

    /* test02
    int bridge_length = 100;
    int weight = 100;
    int[] truck_weights = {10};*/

    /* test03
    int bridge_length = 100;
    int weight = 100;
    int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};*/

    solution(bridge_length, weight, truck_weights);
  }

  static int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    int size = truck_weights.length, idx = 0;
    int current = 0;
    Queue<Integer> bridge = new LinkedList<>();

    do {
      if (bridge.size() == bridge_length)
        current -= bridge.poll();
      if (idx < size && current + truck_weights[idx] <= weight) {
        bridge.add(truck_weights[idx]);
        current += truck_weights[idx++];
      }
      else
        bridge.add(0);
      answer++;
    }while(current != 0);

    System.out.println("result: " + answer);
    return answer;
  }
}

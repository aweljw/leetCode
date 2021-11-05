package com.leetcode.mesh;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
  public static void main(String[] args) {
    System.out.println("test03!!!");

    fibonacci(4);
  }

  public static List<Integer> fibonacci(int n) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      result.add(fibonacciQuest(i));
      System.out.println(fibonacciQuest(i));
    }

    return result;
  }

  static int fibonacciQuest(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacciQuest(n - 2) + fibonacciQuest(n - 1);
    }
  }
}

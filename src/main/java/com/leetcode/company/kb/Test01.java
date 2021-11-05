package com.leetcode.company.kb;

import java.util.Stack;

public class Test01 {
  public static void main(String[] args) {
    String[] arr = { "12", "2", "5", "+", " * ", "9", "3", "/", " - " };

    solution(arr);
  }

  static long solution(String[] arr) {
    Stack<String> stack = new Stack<>();

    for (String s : arr) {
      if(s.contains("+")) {
        int a = Integer.valueOf(stack.pop());
        int b = Integer.valueOf(stack.pop());
        int result = b+a;
        stack.push(Integer.toString(result));
      } else if (s.contains("-")) {
        int a = Integer.valueOf(stack.pop());
        int b = Integer.valueOf(stack.pop());
        int result = b-a;
        stack.push(Integer.toString(result));
      } else if (s.contains("*")) {
        int a = Integer.valueOf(stack.pop());
        int b = Integer.valueOf(stack.pop());
        int result = b*a;
        stack.push(Integer.toString(result));
      } else if (s.contains("/")) {
        int a = Integer.valueOf(stack.pop());
        int b = Integer.valueOf(stack.pop());
        int result = b/a;
        stack.push(Integer.toString(result));
      } else {
        stack.push(s);
      }
    }

    return Long.valueOf(stack.pop());
  }
}

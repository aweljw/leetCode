package com.leetcode.company.eleven;

import java.util.Stack;

public class Test02 {
  public static void main(String[] args) {
    System.out.println(transform("abbcbbb"));
  }

  public static String transform(String input) {
    Stack<String> stack = new Stack<>();
    String result = "";

    for (int i=0; i < input.length(); i++) {
      if (stack.empty()) {
        stack.push(input.substring(i, i+1));
      } else if (!stack.empty() && !stack.peek().equals(input.substring(i, i+1))) {
        stack.push(input.substring(i, i+1));
      }
    }

    for(String s : stack) {
      result = result + s;
    }

    return result;
  }
}

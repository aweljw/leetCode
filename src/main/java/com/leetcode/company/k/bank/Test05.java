package com.leetcode.company.k.bank;

public class Test05 {
  public static void main(String[] args) {
    String number = "onesevenfive";
    solution(number);
  }

  static String solution(String number) {
    if (number.contains("zero")) {
      number = number.replaceAll("zero", "0");
    }
    if (number.contains("one")) {
      number = number.replaceAll("one", "1");
    }
    if (number.contains("two")) {
      number = number.replaceAll("two", "2");
    }
    if (number.contains("three")) {
      number = number.replaceAll("three", "3");
    }
    if (number.contains("four")) {
      number = number.replaceAll("four", "4");
    }
    if (number.contains("five")) {
      number = number.replaceAll("five", "5");
    }
    if (number.contains("six")) {
      number = number.replaceAll("six", "6");
    }
    if (number.contains("seven")) {
      number = number.replaceAll("seven", "7");
    }
    if (number.contains("eight")) {
      number = number.replaceAll("eight", "8");
    }
    if (number.contains("nine")) {
      number = number.replaceAll("nine", "9");
    }

    return number;
  }
}

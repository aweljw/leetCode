package com.leetcode.easy.reverse_integer;

//  Pop and Push Digits & Check before Overflow
public class Approach01 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    reverse(-123);
    long end = System.currentTimeMillis();

    System.out.println("실행 시간 : " + (end - start) / 1000.0 + "초"); //최종 실행시간
  }

  static int reverse(int x) {
    String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();
    try {
      return (x < 0) ? Integer.parseInt(reversed) * -1 : Integer.parseInt(reversed);
    } catch (NumberFormatException e) {
      return 0;
    }
  }
}

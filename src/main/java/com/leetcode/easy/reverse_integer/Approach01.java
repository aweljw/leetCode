package com.leetcode.easy.reverse_integer;

//  Pop and Push Digits & Check before Overflow
public class Approach01 {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    reverse(123);
    long end = System.currentTimeMillis();

    System.out.println("실행 시간 : " + (end - start) / 1000.0 + "초"); //최종 실행시간
  }

  static int reverse(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      rev = rev * 10 + pop;
    }

    System.out.println("result: " + rev);
    return rev;
  }
}

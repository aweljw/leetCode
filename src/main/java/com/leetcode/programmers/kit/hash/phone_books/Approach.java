package com.leetcode.programmers.kit.hash.phone_books;

import java.util.Arrays;

class Approach {
  public static void main(String[] args) {
    //test01
    String[] phoneBook = {"119", "97674223", "1195524421"};

    //test02
    //String[] phoneBook = {"123","456","789"};

    //test03
    //String[] phoneBook = {"12","123","1235","567","88"};

    solution(phoneBook);
  }

  static public boolean solution(String[] phoneBook) {
    Arrays.sort(phoneBook);

    for (int i = 0; i < phoneBook.length - 1; i++) {
      if (phoneBook[i + 1].startsWith(phoneBook[i])) {
        System.out.println("result: false");
        return false;
      }
    }

    System.out.println("result: true");
    return true;
  }
}

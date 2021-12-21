package com.leetcode.itstest.greedy;

public class Greedy3_6 {
  public static void main(String[] args) {
    /**
     * 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 수행하려고 한다.
     * 단, 두번째 연산은 N이 K로 나누어 떨어질 떄만 선택할 수 있다.
     *
     * 1. N에서 1을 뺀다.
     * 2. N을 K로 나눈다.
     */
    System.out.println(solution(17, 4));
  }

  public static int solution(int n, int k) {
    int result = 0;

    while (true) {
      // N이 K로 나누어 떨어지는 수가 될 때까지만 1씩 빼기
      int target = (n / k) * k;
      result += (n - target);
      n = target;
      // N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
      if (n < k) break;
      // K로 나누기
      result += 1;
      n /= k;
    }

    // 마지막으로 남은 수에 대하여 1씩 빼기
    result += (n - 1);
    System.out.println(result);

    return result;
  }
}

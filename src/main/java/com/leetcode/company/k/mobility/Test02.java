package com.leetcode.company.k.mobility;

public class Test02 {
  public static void main(String[] args) {
    System.out.println(solution(new int[]{0, 0, 1, 1}, new int[]{2}));
    System.out.println(solution(new int[]{0, 0, 0, 0, 2, 3, 3}, new int[]{2, 5, 6}));
    System.out.println(solution(new int[]{0, 0, 1, 2}, new int[]{1, 2}));
    System.out.println(solution(new int[]{0, 3, 0, 0, 5, 0, 5}, new int[]{4, 2, 6, 1, 0}));
  }

  public static int solution(
      int[] T,
      int[] A) {
    int n = T.length;
    int m = A.length;
    int[] queue = new int[n];
    int[] check = new int[n];
    int head=0, tail=0;

    for(int i=0;i<=m-1;i++){
      queue[tail++] = A[i];
      check[A[i]] = 1;
    }

    while(head < tail){
      int parent = T[queue[head]];
      if(check[parent] == 0){
        check[parent] = 1;
        queue[tail++] = parent;
      }
      head++;
    }

    return tail;
  }
}

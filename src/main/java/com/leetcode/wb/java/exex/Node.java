package com.leetcode.wb.java.exex;

public class Node {
  int data; //노드 값
  Node left; //왼쪽 자식 노드 참조 값
  Node right; //오른쪽 자식 노드 참조 값

  //추가할 때 참조되는 왼쪽, 오른쪽 자식의 값은 모르닌까 일단 data 값을 기반으로 Node 객체 생성
  Node(int data){
    this.data = data;
  }
}

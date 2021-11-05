package com.leetcode.wb.java;

import java.util.LinkedList;
import java.util.Queue;

public class Test01 {

  private static String answer = "";

  public static void main(String[] args) {
    BinaryTree bt = new BinaryTree();

    String message = "ABCDEF";

    Node node = new Node(message.substring(0, 1));
    Node node1 = new Node(message.substring(1, 2));
    Node node2 = new Node(message.substring(2, 3));
    Node node3 = new Node(message.substring(3, 4));
    Node node4 = new Node(message.substring(4, 5));
    Node node5 = new Node(message.substring(5, 6));

    bt.push(node);
    bt.push(node1);
    bt.push(node2);
    bt.push(node3);
    bt.push(node4);
    bt.push(node5);

    bt.postOrder(node);
    System.out.println("dd");
    System.out.println(answer);
  }

  public static class Node {
    String value;
    Node left;
    Node right;

    public Node(String value) {
      this.value = value;
      left = null;
      right = null;
    }
  }

  public static class BinaryTree {
    Node head;
    int size;

    public BinaryTree() {
      head = null;
      size = 0;
    }

    public void push(Node nd) {
      if (size == 0) {
        Node node = nd;
        head = node;
      } else {
        Node node = head;

        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
          Node temp = q.poll();

          if (temp.left == null) {
            temp.left = nd;
            break;
          } else {
            q.add(temp.left);
          }

          if (temp.right == null) {
            temp.right = nd;
            break;
          } else {
            q.add(temp.right);
          }
        }
      }
      size++;
    }

    public void postOrder(Node node) {
      if (node != null) {
        if (node.left != null) postOrder(node.left);
        if (node.right != null) postOrder(node.right);
        System.out.println(node.value + " ");

        answer += node.value;
      }
    }
  }
}

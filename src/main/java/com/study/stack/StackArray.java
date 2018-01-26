package com.study.stack;

public class StackArray {

  private int capacity = 10;

  private int[] array;

  private int pointer = -1;

  public StackArray() {
    array = new int[capacity];
  }

  public boolean isEmpty() {
    return pointer == -1;
  }

  public boolean isFull() {
    return pointer == capacity - 1;
  }

  public void push(int val) {
    if (isFull()) return;
    array[++pointer] = val;
  }

  public int pop() {
    if (isEmpty()) return -1;
    return array[pointer--];
  }

  public int size() {
    return pointer + 1;
  }

  public int top() {
    if (isEmpty()) return -1;
    return array[pointer];
  }

  public static void main(String[] args) {
    StackArray stack = new StackArray();
    System.out.println(stack.isEmpty());
  }
}

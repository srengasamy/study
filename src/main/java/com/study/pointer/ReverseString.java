package com.study.pointer;

public class ReverseString {

  public static void main(String[] args) {
    System.out.println(reverseString("hello"));
  }

  public static String reverseString(String s) {
    int i = 0;
    int j = s.length() - 1;
    char[] temp = s.toCharArray();
    while (i < j) {
      char c = temp[i];
      temp[i++] = temp[j];
      temp[j--] = c;
    }
    return new String(temp);
  }
}

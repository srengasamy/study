package com.study.pointer;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
  public static void main(String[] args) {
    String s = "ababcbacadefegdehijhklij";
    System.out.println(partitionLabels(s));
  }

  public static List<Integer> partitionLabels(String s) {
    List<Integer> result = new ArrayList<>();
    int l = 0, r;
    while (l < s.length()) {
      r = s.lastIndexOf(s.charAt(l));
      for (int i = l + 1; i <= r; i++) {
        if (s.lastIndexOf(s.charAt(i)) > r) r = s.lastIndexOf(s.charAt(i));
      }
      result.add(r - l + 1);
      l = r + 1;
    }
    return result;
  }
}

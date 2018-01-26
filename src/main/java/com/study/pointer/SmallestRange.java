package com.study.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class SmallestRange {
  public static void main(String[] args) {
    List<List<Integer>> nums = new ArrayList<>();
    nums.add(Arrays.asList(4, 10, 15, 24, 26));
    nums.add(Arrays.asList(0, 9, 12, 20));
    nums.add(Arrays.asList(5, 18, 22, 30));
    Arrays.stream(smallestRange(nums)).forEach(x -> System.out.println(x));
  }

  public static int[] smallestRange(List<List<Integer>> nums) {
    PriorityQueue<Element> queue = new PriorityQueue<>();
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.size(); i++) {
      int value = nums.get(i).get(0);
      queue.add(new Element(value, i, 0));
      max = Math.max(max, value);
    }
    int[] result = new int[2];
    int diff = Integer.MAX_VALUE;
    while (true) {
      Element min = queue.remove();
      if (max - min.value < diff) {
        diff = max - min.value;
        result[0] = min.value;
        result[1] = max;
      }
      if (min.pos + 1 == nums.get(min.source).size()) break;
      else {
        queue.add(new Element(nums.get(min.source).get(min.pos + 1), min.source, min.pos + 1));
        max = Math.max(max, nums.get(min.source).get(min.pos + 1));
      }
    }
    return result;
  }

  static class Element implements Comparable<Element> {
    public int value;
    public int source;
    public int pos;

    Element(int value, int source, int pos) {
      this.value = value;
      this.source = source;
      this.pos = pos;
    }

    @Override
    public int compareTo(Element e) {
      return value - e.value;
    }
  }
}

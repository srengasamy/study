package com.study.pointer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
  public static void main(String[] args) {
    String word = "a.b,.";
    System.out.println(reverseVowels(word));
  }

  public static String reverseVowels(String word) {
    Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    char[] input = word.toCharArray();
    for (int lo = 0, hi = input.length - 1; lo < hi; ) {
      if (!vowels.contains(Character.toLowerCase(input[lo]))) {
        lo++;
        continue;
      }
      if (!vowels.contains(Character.toLowerCase(input[hi]))) {
        hi--;
        continue;
      }
      if (lo < hi) {
        char c = input[lo];
        input[lo] = input[hi];
        input[hi] = c;
        lo++;
        hi--;
      }
    }
    return new String(input);
  }
}

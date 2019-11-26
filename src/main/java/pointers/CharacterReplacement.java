package pointers;

import java.util.HashSet;
import java.util.Set;

public class CharacterReplacement {
  public int characterReplacement(String s, int k) {
    int result = 0;
    int i = 0, j = 0;
    char[] temp = new char[26];
    Set<Character> chars = new HashSet<>();

    while (j < s.length()) {
      char c = s.charAt(j);
      temp[c - 'A']++;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new CharacterReplacement().characterReplacement("ABBB", 2));
  }
}

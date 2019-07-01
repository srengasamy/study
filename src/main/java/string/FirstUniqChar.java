package string;

public class FirstUniqChar {
  public int firstUniqChar(String s) {
    int[] result = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      result[c - 'a']++;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (result[c-'a'] == 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new FirstUniqChar().firstUniqChar("leetcode"));
  }
}

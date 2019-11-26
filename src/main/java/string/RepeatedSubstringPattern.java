package string;

public class RepeatedSubstringPattern {
  public boolean repeatedSubstringPattern(String s) {
    int length = s.length();
    for (int i = 1; i <= length / 2; i++) {
      if (length % i != 0) {
        continue;
      }
      String word = s.substring(0, i);
      StringBuffer sb = new StringBuffer();
      while (sb.length() < s.length()) {
        sb.append(word);
      }
      if (sb.toString().equals(s)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new RepeatedSubstringPattern().repeatedSubstringPattern("abcabcabcabc"));
  }
}

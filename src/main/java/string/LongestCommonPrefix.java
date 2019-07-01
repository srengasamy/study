package string;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0 || strs.length == 1) {
      return "";
    }
    String prefix = prefix(strs[0], strs[1]);
    for (int i = 2; i < strs.length; i++) {
      prefix = prefix(prefix, strs[i]);
    }
    return prefix;
  }

  public String prefix(String a, String b) {
    StringBuffer prefix = new StringBuffer();
    for (int i = 0, j = 0; i < a.length() && j < b.length() && a.charAt(i) == b.charAt(j); i++, j++) {
      prefix.append(a.charAt(i));
    }
    return prefix.toString();
  }

  public static void main(String[] args) {
    System.out.println(new LongestCommonPrefix().longestCommonPrefix(new String[]{"dog", "car", "racecar"}));
  }
}

package string;

public class ValidPalindrome {

  public boolean validPalindrome(String s) {
    int i = 0, j = s.length() - 1;
    while (i <= j && s.charAt(i) == s.charAt(j)) {
      i++;
      j--;
    }
    return i >= j || is(s, i + 1, j) || is(s, i, j - 1);
  }

  public boolean is(String s, int i, int j) {
    while (i <= j && s.charAt(i) == s.charAt(j)) {
      i++;
      j--;
    }
    return i >= j;
  }

  public static void main(String[] args) {
    System.out.println(new ValidPalindrome().validPalindrome("abcda"));
  }
}

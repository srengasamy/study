package string;

public class ShortestPalindrome {
  public static void main(String[] args) {
    System.out.println(new ShortestPalindrome().shortestPalindrome("a"));
  }

  public String shortestPalindrome(String s) {
    for (int i = s.length(); i > 1; i--) {
      String pal = s.substring(0, i);
      if (isPalindrome(pal)) {
        return new StringBuffer(s.substring(i)).reverse().append(s).toString();
      }
    }
    return new StringBuffer(s.substring(1)).reverse().append(s).toString();
  }

  public boolean isPalindrome(String s) {
    return new StringBuffer(s).reverse().toString().equals(s);
  }
}

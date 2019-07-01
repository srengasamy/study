package string;

public class NearestPalindromic {
  public String nearestPalindromic(String n) {
    if (n.equals("1")) {
      return "0";
    }
    String mirror = mirror(n);
    long diff = Math.abs(Long.parseLong(n) - Long.parseLong(mirror));
    return "";
  }

  public String mirror(String n) {
    String half = n.substring(0, n.length() / 2);
    if (n.length() % 2 == 1) {
      return half + n.charAt(n.length() / 2) + new StringBuffer(half).reverse();
    }
    return half + new StringBuffer(half).reverse();
  }

  public static void main(String[] args) {
    System.out.println(new NearestPalindromic().mirror("12345"));
  }
}

package string;

public class Needle {
  public int needle(String haystack, String needle) {
    if (needle.isEmpty()) {
      return 0;
    }
    for (int i = 0; i <= haystack.length() - needle.length(); i++) {
      for (int j = 0; j < needle.length() && needle.charAt(j) == haystack.charAt(i + j); j++) {
        if (j == needle.length() - 1) {
          return i;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new Needle().needle("aaaaa", ""));
  }
}

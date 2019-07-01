package string;

public class ReverseWords2 {
  public void reverseWords(char[] s) {
    reverse(s, 0, s.length - 1);
    for (int i = -1, j = 0; j < s.length; j++) {
      if (s[j] != ' ') {
        if (i == -1) {
          i = j;
        }
        if (j + 1 == s.length) {
          reverse(s, i, j);
        }
      } else {
        reverse(s, i, j - 1);
        i = -1;
      }
    }
  }

  public static void main(String[] args) {
    char[] s = {'t', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e'};
    new ReverseWords2().reverseWords(s);
    System.out.println(new String(s));
  }

  public void reverse(char[] s, int i, int j) {
    while (i < j) {
      char c = s[i];
      s[i++] = s[j];
      s[j--] = c;
    }
  }
}

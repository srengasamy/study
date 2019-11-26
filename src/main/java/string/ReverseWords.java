package string;

public class ReverseWords {

  public static void main(String[] args) {
    System.out.println(new ReverseWords().reverseWords("  hello world!  "));
  }

  public String reverseWords(String S) {
    char[] chars = S.toCharArray();
    reverse(chars, 0, chars.length - 1);
    int s = -1, e = 0, top = 0;
    while (e < chars.length) {
      if (chars[e] != ' ' && s == -1) {
        s = e;
      }
      if ((e + 1 == chars.length || chars[e + 1] == ' ') && s > -1) {
        reverse(chars, s, e);
        s = -1;
      }
      e++;
    }
    char last = ' ';
    for (int i = 0; i < chars.length; i++) {
      if (!(last == ' ' && chars[i] == ' ')) {
        chars[top++] = chars[i];
        last = chars[i];
      }

    }
    char[] result = new char[top];
    System.arraycopy(chars, 0, result, 0, top);
    return "|" + new String(result) +"|";
  }

  public void reverse(char[] chars, int i, int j) {
    while (i < j) {
      char c = chars[i];
      chars[i++] = chars[j];
      chars[j--] = c;
    }
  }
}

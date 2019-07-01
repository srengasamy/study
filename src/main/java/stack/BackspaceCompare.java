package stack;

public class BackspaceCompare {
  public boolean backspaceCompare(String S, String T) {
    StringBuffer s = new StringBuffer();
    StringBuffer t = new StringBuffer();
    for (char c : S.toCharArray()) {
      if (c == '#') {
        if (s.length() > 0) {
          s.deleteCharAt(s.length() - 1);
        }
      } else {
        s.append(c);
      }
    }
    for (char c : T.toCharArray()) {
      if (c == '#') {
        if (t.length() > 0) {
          t.deleteCharAt(t.length() - 1);
        }
      } else {
        t.append(c);
      }
    }
    return s.toString().equals(t.toString());
  }

  public static void main(String[] args) {
    System.out.println(new BackspaceCompare().backspaceCompare("a#c", "b"));
  }
}

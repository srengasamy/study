package stack;

public class RemoveOuterParentheses {

  public String removeOuterParentheses(String S) {
    int count = 0;
    StringBuffer sb = new StringBuffer();
    for (char c : S.toCharArray()) {
      if (c == '(') {
        count++;
        if (count > 1) {
          sb.append(c);
        }
      } else {
        if (count > 1) {
          sb.append(c);
        }
        count--;
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new RemoveOuterParentheses().removeOuterParentheses("()()"));
  }
}

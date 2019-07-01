package stack;

public class RemoveKdigits {
  public static void main(String[] args) {
    System.out.println(new RemoveKdigits().removeKdigits("1230", 2));
  }

  public String removeKdigits(String num, int k) {
    int digits = num.length() - k;
    char[] stack = new char[num.length()];
    int top = 0;
    for (char c : num.toCharArray()) {
      while (top > 0 && stack[top - 1] > c && k > 0) {
        top--;
        k--;
      }
      stack[top++] = c;
    }
    int idx = 0;
    while (idx < digits && stack[idx] == '0') {
      idx++;
    }
    return idx == digits ? "0" : new String(stack, idx, digits - idx);
  }
}

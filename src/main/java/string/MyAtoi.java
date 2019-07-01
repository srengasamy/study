package string;

public class MyAtoi {
  public int myAtoi(String str) {
    str = str.trim();
    if (str.isEmpty()) {
      return 0;
    }
    int i = 0, result = 0;
    boolean neg = false;
    char c = str.charAt(0);
    if (c == '+' || c == '-') {
      i++;
      neg = str.charAt(0) == '-';
    } else if (!Character.isDigit(c)) {
      return 0;
    }
    while (i < str.length()) {
      c = str.charAt(i);
      if (Character.isDigit(c)) {
        if (result * 10 + (c - '0') > Integer.MAX_VALUE) {
          result = Integer.MAX_VALUE;
          break;
        }
        result = result * 10 + (c - '0');
      } else {
        break;
      }
      i++;
    }
    if (result == Integer.MAX_VALUE) {
      if (neg) {
        return Integer.MIN_VALUE;
      }
      return Integer.MAX_VALUE;
    }
    return neg ? -result : result;
  }

  public static void main(String[] args) {
    System.out.println(new MyAtoi().myAtoi("-91283472332"));
  }
}

package string;

public class ReverseStr {
  public String reverseStr(String s, int k) {
    char[] result = s.toCharArray();
    if (s.length() < k) {
      reverse(result, 0, result.length - 1);
      return new String(result);
    }
    for (int i = 0; i < result.length; i += 2 * k) {
      int left = i;
      int right = i + k - 1;
      if (right > result.length - 1) {
        break;
      }
      reverse(result, left, right);
    }
    return new String(result);
  }

  public void reverse(char[] result, int i, int j) {
    while (i <= j) {
      char c = result[i];
      result[i] = result[j];
      result[j] = c;
      i++;
      j--;
    }
  }

  public static void main(String[] args) {
    System.out.println(new ReverseStr().reverseStr("abcdefgh", 8));
  }
}

package stack;

public class MinAddToMakeValid {
  public int minAddToMakeValid(String S) {
    int i = -1;
    int ans = 0;
    for (char c : S.toCharArray()) {
      if (c == ')') {
        if (i == -1) {
          ans++;
        } else {
          i--;
        }
      } else {
        i++;
      }
    }
    return i >= 0 ? (i + 1) + ans : ans;
  }

  public static void main(String[] args) {
    System.out.println(new MinAddToMakeValid().minAddToMakeValid("()(()"));
  }
}

package string;

public class RepeatedStringMatch {
  public int repeatedStringMatch(String A, String B) {
    int ans = 0;
    int first = B.indexOf(A);
    if (first == -1) {
      return -1;
    }
    int last = B.lastIndexOf(A) + (A.length() - 1);
    if (first > 0) {
      ans++;
    }
    if (last != B.length() - 1) {
      ans++;
    }
    ans += ((last - first) + 1) / A.length();
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(new RepeatedStringMatch().repeatedStringMatch("aa", "a"));
  }
}

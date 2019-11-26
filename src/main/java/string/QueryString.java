package string;

public class QueryString {
  public boolean queryString(String S, int N) {
    for (int i = 1; i <= N; i++) {
      if (!S.contains(Integer.toBinaryString(i))) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new QueryString().queryString("0110", 4));
  }
}

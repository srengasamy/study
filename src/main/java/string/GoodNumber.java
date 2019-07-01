package string;

public class GoodNumber {

  public static void main(String[] args) {
    System.out.println(new GoodNumber().goodNumber(10));
  }

  public int goodNumber(int N) {
    int ans = 0;
    for (int i = 1; i <= N; i++) {
      if (good(i)) {
        ans++;
      }
    }
    return ans;
  }

  public boolean good(int num) {
    boolean found = false;
    while (num > 0) {
      int digit = num % 10;
      if (digit == 3 || digit == 4 || digit == 7) {
        return false;
      }
      if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
        found = true;
      }
      num = num / 10;
    }
    return found;
  }
}

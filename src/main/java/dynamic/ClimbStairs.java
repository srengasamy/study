package dynamic;

public class ClimbStairs {
  public int climbStairs(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1 || n == 2) {
      return n;
    }
    return climbStairs(n - 1) + climbStairs(n - 2);
  }

  public int climb(int n) {
    if (n == 0 || n == 1 || n == 2) {
      return n;
    }
    int[] result = new int[n + 1];
    result[1] = 1;
    result[2] = 2;
    for (int i = 3; i <= n; i++) {
      result[i] = result[i - 1] + result[i - 2];
    }
    return result[n];
  }

  public static void main(String[] args) {
    System.out.println(new ClimbStairs().climb(3));
  }
}

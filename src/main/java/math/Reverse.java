package math;

public class Reverse {
  public int reverse(int x) {
    int reversed = 0;
    while (x != 0) {
      int d = x % 10;
      if (10 * reversed >= Integer.MAX_VALUE || 10 * reversed <= Integer.MIN_VALUE) {
        return 0;
      }
      reversed = 10 * reversed + d;
      x = x / 10;
    }
    return reversed;
  }

  public static void main(String[] args) {
    System.out.println(new Reverse().reverse(1534236469));
  }
}

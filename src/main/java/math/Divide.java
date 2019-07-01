package math;

public class Divide {
  public int divide(int dividend, int divisor) {
    boolean neg = false;
    if (dividend < 0) {
      neg = !neg;
      dividend = -dividend;
    }
    if (divisor < 0) {
      neg = !neg;
      divisor = -divisor;
    }
    int res = 0;
    while (dividend >= divisor) {
      dividend = dividend - divisor;
      res++;
    }
    return neg ? -res : res;
  }

  public static void main(String[] args) {
      System.out.println(new Divide().divide(1  , 1));
  }
}

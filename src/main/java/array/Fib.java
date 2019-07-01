package array;

public class Fib {

  public static void main(String[] args) {
    System.out.println(new Fib().fib(4));
  }

  public int fib(int N) {
    int i = 0;
    int j = 1;
    while (N-- > 1) {
      int sum = i + j;
      i = j;
      j = sum;
    }
    return j;
  }
}

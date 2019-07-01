package dynamic;

public class NumSquares {
  public int numSquares1(int n) {
    int[] aux = new int[n + 1];
    aux[0] = 0;
    aux[1] = 1;
    aux[2] = 2;
    for (int i = 3; i <= n; i++) {
      int result = i;
      for (int j = 1; j <= i; j++) {
        int square = j * j;
        if (square > i) {
          break;
        }
        result = Math.min(result, 1 + aux[i - square]);
      }
      aux[i] = result;
    }
    return aux[n];
  }
  public static void main(String[] args) {
    System.out.println(new NumSquares().numSquares1(13));
  }


  public int numSquares(int n) {
    if (n <= 3) {
      return n;
    }
    int result = n;
    for (int i = 1; i <= n; i++) {
      int square = i * i;
      if (square > n) {
        break;
      }
      result = Math.min(result, i + numSquares(n - square));
    }
    return result;
  }



}

package dynamic;

public class IntegerBreak {

  public int integerBreak(int n) {
    int[] aux = new int[n + 1];
    aux[1] = 1;
    for (int i = 2; i <= n; i++) {
      for (int j = 1; j < i; j++) {
        int left = Math.max(j, aux[j]);
        int right = Math.max(i - j, aux[i - j]);
        aux[i] = Math.max(aux[i], left * right);
      }
    }
    return aux[n];
  }

  public static void main(String[] args) {
    System.out.println(new IntegerBreak().integerBreak(10));
  }
}

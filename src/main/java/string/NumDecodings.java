package string;

public class NumDecodings {
  public int numDecodings(String s) {
    int n = s.length();
    if (n == 0) return 0;

    int[] aux = new int[n + 1];
    aux[n] = 1;
    aux[n - 1] = s.charAt(n - 1) == '0' ? 0 : 1;
    for (int i = n - 2; i >= 0; i--) {
      if (s.charAt(i) == '0') {
        continue;
      }
      aux[i] = Integer.parseInt(s.substring(i, i + 2)) <= 26 ? aux[i + 1] + aux[i + 1] : aux[i + 1];
    }
    return aux[0];
  }

  public static void main(String[] args) {
    System.out.println(new NumDecodings().numDecodings("226"));
  }
}

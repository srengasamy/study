package string;

public class NumDistinct {

  public int numDistinct(String s, String t) {
    int[][] mem = new int[t.length() + 1][s.length() + 1];
    for (int i = 0; i < s.length(); i++) {
      mem[0][i] = 1;
    }
    for (int r = 1; r < mem.length; r++) {
      for (int c = 1; c < mem[0].length; c++) {
        if (t.charAt(r - 1) == s.charAt(c - 1)) {
          mem[r][c] = mem[r - 1][c - 1] + mem[r][c - 1];
        } else {
          mem[r][c] = mem[r][c - 1];
        }
      }
    }
    return mem[t.length()][s.length()];
  }

  public static void main(String[] args) {
    System.out.println(new NumDistinct().numDistinct("babgbag", "bag"));
  }

}

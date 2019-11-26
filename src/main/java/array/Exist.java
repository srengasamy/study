package array;

public class Exist {

  public static void main(String[] args) {
    char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
    };
    System.out.println(new Exist().exist(board, "SEE"));
  }

  public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (search(board, new boolean[m][n], word, i, j, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean search(char[][] board, boolean[][] seen, String word, int i, int j, int k) {
    if (k == word.length()) {
      return true;
    }
    char c = word.charAt(k);
    if (!(i >= 0 && i < board.length) || !(j >= 0 && j < board[0].length) || board[i][j] != c || seen[i][j]) {
      return false;
    }
    seen[i][j] = true;
    return search(board, seen, word, i - 1, j, k + 1)
            || search(board, seen, word, i, j - 1, k + 1)
            || search(board, seen, word, i + 1, j, k + 1)
            || search(board, seen, word, i, j + 1, k + 1);
  }
}

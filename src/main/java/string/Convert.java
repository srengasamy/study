package string;

public class Convert {
  public String convert(String s, int numRows) {
    StringBuffer[] rows = new StringBuffer[numRows];
    for (int i = 0; i < numRows; i++) {
      rows[i] = new StringBuffer();
    }
    boolean down = true;
    int i = 0, row = 0;
    while (i < s.length()) {
      rows[row].append(s.charAt(i));
      if (down) {
        if (row + 1 == numRows - 1) {
          down = false;
        }
        row++;
      } else {
        if (row - 1 == 0) {
          down = true;
        }
        row--;
      }
      i++;
    }
    StringBuffer res = new StringBuffer();
    for (StringBuffer sb : rows) {
      res.append(sb.toString());
    }
    return res.toString();
  }

  public static void main(String[] args) {
    System.out.println(new Convert().convert("PAYPALISHIRING", 4));
  }
}

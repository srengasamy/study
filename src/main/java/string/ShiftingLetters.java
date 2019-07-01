package string;

public class ShiftingLetters {
  public String shiftingLetters(String S, int[] shifts) {
    for (int i = shifts.length - 2; i >= 0; i--) {
      shifts[i] = (shifts[i] + shifts[i + 1]) % 26;
    }
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      int shift = shifts[i] % 26;
      c = c + shift <= 'z' ? (char) (c + shift) : (char) ('a' + (c + shift) - 'z' - 1);
      sb.append(c);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new ShiftingLetters().shiftingLetters("mkgfzkkuxownxvfvxasy", new int[]{505870226, 437526072, 266740649, 224336793, 532917782, 311122363, 567754492, 595798950, 81520022, 684110326, 137742843, 275267355, 856903962, 148291585, 919054234, 467541837, 622939912, 116899933, 983296461, 536563513}));
  }
}

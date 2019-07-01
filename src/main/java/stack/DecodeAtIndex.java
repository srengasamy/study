package stack;

public class DecodeAtIndex {
  public String decodeAtIndex(String S, int K) {
    StringBuffer sb = new StringBuffer();
    for (char c : S.toCharArray()) {
      if (K == 1) {
        return String.valueOf(c);
      } else if (c >= '0' && c <= '9') {

      } else {
        sb.append(c);
        K--;
      }
    }
    return "";
  }
}

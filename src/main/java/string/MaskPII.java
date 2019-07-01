package string;

public class MaskPII {
  public String maskPII(String S) {
    if (S.indexOf("@") > -1) {
      String[] parts = S.split("@");
      return (parts[0].charAt(0) + "*****" + parts[0].charAt(parts[0].length() - 1) + "@" + parts[1]).toLowerCase();
    }
    String s = S.replaceAll("\\W+", "");
    String last4 = s.substring(s.length() - 4);
    if (s.length() == 10) {
      return "***-***-" + last4;
    }
    int country = s.length() - 10;
    StringBuffer sb = new StringBuffer("+");
    for (int i = 0; i < country; i++) {
      sb.append('*');
    }
    return sb.append("-***-***-" + last4).toString();
  }

  public static void main(String[] args) {
    System.out.println(new MaskPII().maskPII("+(501321)-50-23431"));
  }
}

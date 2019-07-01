package string;

public class CompareVersion {

  public int compareVersion(String version1, String version2) {
    String[] parts1 = version1.split("\\.");
    String[] parts2 = version2.split("\\.");
    int length = Math.max(parts1.length, parts2.length);
    for (int i = 0; i < length; i++) {
      Integer v1 = i < parts1.length ? Integer.parseInt(parts1[i]) : 0;
      Integer v2 = i < parts2.length ? Integer.parseInt(parts2[i]) : 0;
      int compare = v1.compareTo(v2);
      if (compare != 0) {
        return compare;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(new CompareVersion().compareVersion("7.5.2.4", "7.5.3"));
  }
}

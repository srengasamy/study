package string;

public class NumKLenSubstrNoRepeats {
  public int numKLenSubstrNoRepeats(String S, int K) {
    int repeated = 0, ans = 0;
    int[] chars = new int[26];
    for (int i = 0, j = 0; j < S.length(); j++) {
      char c = S.charAt(j);
      chars[c - 'a']++;
      if (chars[c - 'a'] > 1) {
        repeated++;
      }
      while (repeated > 0 && i < j) {
        c = S.charAt(i);
        if (chars[c - 'a'] == 2) {
          repeated--;
        }
        chars[c - 'a']--;
        i++;
      }
      if (j - i + 1 >= K) {
        ans++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(new NumKLenSubstrNoRepeats().numKLenSubstrNoRepeats("havefunonleetcode", 5));
  }
}

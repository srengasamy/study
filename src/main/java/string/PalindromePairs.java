package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {
  public List<List<Integer>> palindromePairs(String[] words) {

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
      for (int j = i + 1; j < words.length; j++) {
        if (isPalindrome(words[i] + words[j])) {
          result.add(Arrays.asList(i, j));
        }
        if (isPalindrome(words[j] + words[i])) {
          result.add(Arrays.asList(j, i));
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new PalindromePairs().palindromePairs(new String[]{"bat","tab","cat"}));
  }

  public boolean isPalindrome(String a) {
    return new StringBuffer(a).reverse().toString().equals(a);
  }
}

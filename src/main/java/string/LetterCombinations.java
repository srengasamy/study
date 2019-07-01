package string;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
  String[] words = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    combination(digits, new char[digits.length()], 0, result);
    return result;
  }

  public void combination(String digits, char[] temp, int i, List<String> results) {
    if (i == digits.length()) {
      results.add(new String(temp));
      return;
    }
    for (char c : words[digits.charAt(i) - '0'].toCharArray()) {
      temp[i] = c;
      combination(digits, temp, i+1, results);
    }
  }

  public static void main(String[] args) {
    System.out.println(new LetterCombinations().letterCombinations("23"));
  }
}

package string;

public class ValidWordAbbreviation {
  public boolean validWordAbbreviation(String word, String abbr) {
    int i = 0, j = 0;
    while (i < word.length() && j < abbr.length()) {
      if (word.charAt(i) == abbr.charAt(j)) {
        i++;
        j++;
        continue;
      }
      if (Character.isAlphabetic(abbr.charAt(j))) {
        return false;
      }
      int start = j;
      while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
        j++;
      }
      int num = Integer.parseInt(abbr.substring(start, j));
      i += num;
    }
    return i == word.length() && j == abbr.length();
  }

  public static void main(String[] args) {
    System.out.println(new ValidWordAbbreviation().validWordAbbreviation("hi", "2i"));
  }
}

package string;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class GroupStrings {
  public List<List<String>> groupStrings(String[] strings) {

    return null;
  }

  public static void main(String[] args) {
    //System.out.println(new GroupStrings().groupStrings(new String[]{"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"}));
    Set<Word> set = new HashSet<>();
    set.add(new Word("abc"));
    System.out.println(set.contains(new Word("bcd")));
  }

  public static class Word {
    public String word;

    public Word(String word) {
      this.word = word;
    }

    @Override
    public boolean equals(Object o) {
      Word other = (Word) o;
      if (word.length() != other.word.length()) {
        return false;
      }
      Set<Integer> diffs = new HashSet<>();
      for (int i = 0; i < word.length(); i++) {
        diffs.add(Math.abs(word.charAt(i) - other.word.charAt(i)));
      }
      return diffs.size() == 1;
    }

    @Override
    public int hashCode() {
      return Objects.hash(word);
    }
  }
}

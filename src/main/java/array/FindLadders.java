package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLadders {
  public static void main(String[] args) {
    String beginWord = "hit";
    String endWord = "cog";
    //"hit","hot","dot","dog","cog"
    //"hit","hot","lot","log","cog"
    List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
    System.out.println(new FindLadders().findLadders(beginWord, endWord, wordList));
  }

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    List<List<String>> results = new ArrayList<>();
    process(new int[wordList.size()], beginWord, wordList, endWord, new ArrayList<>());
    return results;
  }

  public void process(int[] nums, String word, List<String> wordList, String endWord, List<String> result) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == -1) {
        continue;
      }
      String original = wordList.get(i);
      if (isMatch(word, original) && isMatch(original, endWord)) {
        System.out.println(result + "," + original);
        return;
      }
      if (isMatch(original, word)) {
        nums[i] = -1;
        result.add(original);
        process(nums, original, wordList, endWord, result);
        result.remove(original);
        nums[i] = 0;
      }
    }
  }

  public boolean isMatch(String first, String second) {
    int diff = 0;
    for (int i = 0; i < first.length(); i++) {
      if (first.charAt(i) != second.charAt(i)) {
        diff++;
      }
    }
    return diff == 1;
  }
}

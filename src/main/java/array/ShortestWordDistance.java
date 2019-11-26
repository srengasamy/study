package array;

public class ShortestWordDistance {

  public int shortestWordDistance(String[] words, String word1, String word2) {
    int i1 = -1, i2 = -1, distance = words.length;
    boolean same = word1.equals(word2);
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(word1)) {
        if (same) {
          i2 = i1;
        }
        i1 = i;
      } else if (words[i].equals(word2)) {
        i2 = i;
      }
      if (i1 > -1 && i2 > -1 && Math.abs(i1 - i2) < distance) {
        distance = Math.abs(i1 - i2);
      }
    }
    return distance;
  }

  public static void main(String[] args) {
    System.out.println(new ShortestWordDistance().shortestWordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes", "coding"));
  }
}

package array;

import java.util.Arrays;

public class DeckRevealedIncreasing {
  public static void main(String[] args) {
    int[] nums = new int[]{17, 13, 11, 2, 3, 5, 7};
    int[] result = new DeckRevealedIncreasing().deckRevealedIncreasing(nums);
    System.out.println(result);
  }

  public int[] deckRevealedIncreasing(int[] deck) {
    Arrays.sort(deck);
    int[] temp = new int[deck.length];
    Arrays.fill(temp, Integer.MIN_VALUE);
    temp[0] = deck[0];
    int j = 0;
    for (int i = 1; i < deck.length; i++) {
      int jump = 1;
      while (true) {
        j = j % temp.length;
        if (temp[j] != Integer.MIN_VALUE) {
          j++;
        } else if (temp[j] == Integer.MIN_VALUE) {
          if (jump == 0) {
            temp[j++] = deck[i];
            break;
          } else {
            jump--;
            j++;
          }
        }
      }
    }
    return temp;
  }
}

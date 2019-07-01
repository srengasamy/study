package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
  public String encode(List<String> strs) {
    StringBuffer sb = new StringBuffer();
    for (String str : strs) {
      StringBuffer word = new StringBuffer();
      for (char c : str.toCharArray()) {
        word.append((int) c);
        word.append(',');
      }
      sb.append(word.toString() + "|");
    }
    return sb.toString();
  }

  public List<String> decode(String s) {
    String[] words = s.split("\\|");
    List<String> result = new ArrayList<>();
    for (String word : words) {
      String[] chars = word.split(",");
      StringBuffer temp = new StringBuffer();
      for (String c : chars) {
        if (c.equals("")) {
          continue;
        }
        temp.append((char) Integer.parseInt(c));
      }
      result.add(temp.toString());
    }
    return result;
  }

  public static void main(String[] args) {
    Codec codec = new Codec();
    String encoded = codec.encode(Arrays.asList("one", "two", "three"));
    System.out.println(codec.decode(encoded));
  }
}

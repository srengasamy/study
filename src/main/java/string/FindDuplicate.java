package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicate {
  public List<List<String>> findDuplicate(String[] paths) {
    Map<String, List<String>> map = new HashMap<>();
    for (String path : paths) {
      String[] parts = path.split(" ");
      for (int i = 1; i < parts.length; i++) {
        String filename = parts[i].substring(0, parts[i].indexOf("("));
        String content = parts[i].substring(parts[i].indexOf("(") + 1, parts[i].length() - 1);
        List<String> files = map.getOrDefault(content, new ArrayList<>());
        files.add(parts[0] + "/" + filename);
        map.put(content, files);
      }
    }
    List<List<String>> results = new ArrayList<>();
    for (List<String> values : map.values()) {
      if (values.size() > 1) {
        results.add(values);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    System.out.println(new FindDuplicate().findDuplicate(new String[]{"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"}));
  }
}

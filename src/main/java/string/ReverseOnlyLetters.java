package string;

public class ReverseOnlyLetters {
  public String reverseOnlyLetters(String S) {
    char[] result = new char[S.length()];
    int i = 0, j = result.length - 1;
    while (i <= j) {
      if (!Character.isAlphabetic(S.charAt(i))) {
        result[i] = S.charAt(i);
        i++;
        continue;
      }
      if (!Character.isAlphabetic(S.charAt(j))) {
        result[j] = S.charAt(j);
        j--;
        continue;
      }
      result[i] = S.charAt(j);
      result[j] = S.charAt(i);
      i++;
      j--;
    }
    return new String(result);
  }

  public static void main(String[] args) {
    System.out.println(new ReverseOnlyLetters().reverseOnlyLetters("Test1ng-Leet=code-Q!"));
  }
}

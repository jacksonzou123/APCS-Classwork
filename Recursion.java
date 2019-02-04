import java.util.ArrayList;
import java.util.List;

public class Recursion{
  public static List<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> f = new ArrayList<>();
    helper(k, "", maxLetter, f);
    return f;
  }

  public static void helper(int k, String word, int maxLetter, List<String> data) {
    if (k == 0) {
      data.add(word);
    }
    else {
      for (int i = 0; i < maxLetter; i++) {
        helper(k-1,word+(char)('a'+i),maxLetter,data);
      }
    }
  }

  public static void main(String[] args) {
    System.out.println(makeAllWords(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
  }
}

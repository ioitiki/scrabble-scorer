import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrabbleScorer {

  public Integer calculateScore(String input) {
    Integer score = 0;
    String[] onePoint = new String[] {"a", "e", "i", "o", "u", "l", "n", "r", "s", "t"};
    String[] twoPoints = new String[] {"d", "g"};
    String[] threePoints = new String[] {"b", "c", "m", "p"};
    String[] fourPoints = new String[] {"f", "h", "v", "w", "y"};
    String[] fivePoints = new String[] {"k"};
    String[] eightPoints = new String[] {"j", "x"};
    String[] tenPoints = new String[] {"q", "z"};

    String[] inputArray = input.toLowerCase().split("");
    // ArrayList<Character> inputArray = new ArrayList<Character>();
    // inputArray = input.split("");

    for (String letter : inputArray) {

      if (Arrays.asList(onePoint).contains(letter)) {
        score += 1;
      } if  (Arrays.asList(twoPoints).contains(letter)) {
        score += 2;
      } if  (Arrays.asList(threePoints).contains(letter)) {
        score += 3;
      } if  (Arrays.asList(fourPoints).contains(letter)) {
        score += 4;
      } if  (Arrays.asList(fivePoints).contains(letter)) {
        score += 5;
      } if  (Arrays.asList(eightPoints).contains(letter)) {
        score += 8;
      } if  (Arrays.asList(tenPoints).contains(letter)) {
        score += 10;
      }

    }

    return score;
  }
}

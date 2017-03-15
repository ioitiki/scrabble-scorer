import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleScorerTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnsScoreForSingleLetter_10() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoLetters() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 11;
    assertEquals(expected, testScrabble.calculateScore("qa"));
  }

  @Test
  public void calculateScore_returnsScoreForThreeLetters() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("cat"));
  }

  @Test
  public void calculateScore_returnsScoreForTwoWords() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 16;
    assertEquals(expected, testScrabble.calculateScore("cat qa"));
  }

  @Test
  public void calculateScore_returnsScroreForUpperAndLowerCaseWords() {
    ScrabbleScorer testScrabble = new ScrabbleScorer();
    Integer expected = 16;
    assertEquals(expected, testScrabble.calculateScore("Cat Qa"));
  }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountVowelsTest {

  CountVowels countVowels;

  @Before
  public void setup(){
    countVowels = new CountVowels();
  }

  @Test
  public void countVowels() {
    String myString = "aagggegggeigigogogudsu";
    int sum = countVowels.countVowels(myString);
    assertEquals(10, sum);
  }
}
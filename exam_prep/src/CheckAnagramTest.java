import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckAnagramTest {

  CheckAnagram checkAnagram;

  @Before
  public void setup(){
    checkAnagram = new CheckAnagram();
  }

  @Test
  public void checkAnagram() {
    Boolean testing = checkAnagram.checkAnagram("mom", "mom");

    assertTrue(testing);
  }
}
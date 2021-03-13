import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SumOfDigitsTest {

  SumOfDigits sumOfDigits;
  String myString = "1kjh234kjhkjh22 23542";

  @Before
  public void setup(){
    sumOfDigits = new SumOfDigits();
  }

  @Test
  public void methodShouldReturnSum() {
    int sum = sumOfDigits.getDigits(myString);
    assertEquals(30, sum);
  }
 }

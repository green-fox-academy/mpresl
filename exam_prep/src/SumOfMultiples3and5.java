public class SumOfMultiples3and5 {
  public int sumOfMiltiples3and5(int number) {
    int sum = 0;
    for (int i = 0; i <= number ; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        sum+=i;
      }
    }
    return sum;
  }
}

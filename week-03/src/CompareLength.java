public class CompareLength {
    public static void main(String[] args){
        int[] firstArrayOfNumbers = new int[] {1,2,3};
        int[] secondArrayofNumbers = new int[] {4,5};

        if (firstArrayOfNumbers.length > secondArrayofNumbers.length){
            System.out.println("FirstArrayOfNumbers is longer.");
        }else{
            System.out.println("SecondArrayOfNumbers is longer.");
        }
    }
}


// - Create an array variable named `firstArrayOfNumbers`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `secondArrayOfNumbers`
//   with the following content: `[4, 5]`
// - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
//   elements than `firstArrayOfNumbers`
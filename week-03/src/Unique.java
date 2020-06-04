import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args){
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    }
    public static String unique(int[] originalArray){
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (int i = 0; i < originalArray.length; i++) {
            if (noDuplicates.contains(originalArray[i])) {
                continue;
            } else {
                noDuplicates.add(originalArray[i]);
            }
        }
        return Arrays.toString(noDuplicates.toArray());
    }
}

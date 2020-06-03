import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {

        int[] randomArray;

        int[] numberArray = new int[10];

        randomArray = new int[20];
        randomArray[1] = 2;

        String[] stringArray = {"Just", "random", "word"};

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i;
        }

        int k = 1;


        for (int j = 0; j < numberArray.length; j++) {
            System.out.print("| " + j + " ");
        }
        System.out.println("|");

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                multiArray[i][j] = i + " " + j;
            }
        }
        while (k <= 61) {
            System.out.print("-");
            k++;
        }
        System.out.println();

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println("|");
        }
        for (int row : numberArray){
            System.out.print(row);
        }
        System.out.println("\n");

        for(String[] rows : multiArray){
            for(String column : rows){
                System.out.print("| "+column+" ");
            }
            System.out.println("|");
        }
        System.out.println(Arrays.toString(numberArray));

        int[] numsToSort = new int[10];

        for(int i = 0; i <10; i++){
            numsToSort[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numsToSort));
        Arrays.sort(numsToSort);
        System.out.println(Arrays.toString(numsToSort));
    }

}
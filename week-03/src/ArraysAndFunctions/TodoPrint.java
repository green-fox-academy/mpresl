package ArraysAndFunctions;

public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        String p1 = "My todo: \n";
        String dlGames = " - Download games\n";
        String diabl0 = " - Diablo\n";
        todoText = p1+todoText+dlGames+diabl0;

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }
}

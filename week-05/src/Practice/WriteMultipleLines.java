package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args){
        String file = "src/Practice/my-fileML.txt";
        String word = "apple";
        int num = 5;

        writeLines(file, word, num);

    }
    public static void writeLines(String fileName, String word, int num){
        Path filepath = Paths.get(fileName);
        List<String> content = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            content.add(word);
        }
        try {
            Files.write(filepath, content);
        }catch (IOException ex){
        }
    }
}

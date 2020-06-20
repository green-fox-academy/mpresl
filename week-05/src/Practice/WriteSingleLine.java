package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args){
        List<String> content = new ArrayList<>();
        content.add("Hello World");

        try{
            Path filepath = Paths.get("my-file.txt");
            Files.write(filepath, content);
            System.out.println(Files.isWritable(filepath));
        }catch (IOException ex){
            System.out.println("Unable to write file: my-file.txt");
        }finally {
            System.out.println("Done");
        }
    }
}

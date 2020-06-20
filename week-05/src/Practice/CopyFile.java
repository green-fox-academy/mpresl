package Practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String file = "src/Practice/my-fileML.txt";
        String copyOfFile = "src/Practice/my-fileMLcopy.txt";
        System.out.println(copyFile(file, copyOfFile));
    }

    public static boolean copyFile(String original, String destination) {
        Path filepath = Paths.get(original);
        Path copyDestination = Paths.get(destination);
        if(!Files.exists(copyDestination)) {
            try {
                Files.createFile(copyDestination);
            }catch (IOException ex){
                System.out.println("Cannot create file");
                return false;
            }
        }
        try {
            List<String> lines = Files.readAllLines(filepath);
            try {
                Files.write(copyDestination, lines);
            } catch (IOException ex) {
                System.out.println("Unable to write");
                return false;
            }
        } catch (IOException ex) {
            System.out.println("Unable to read " + original);
            return false;
        }
        return true;
    }
}

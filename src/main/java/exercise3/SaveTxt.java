package exercise3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveTxt {

    public static void writeToFile(String content, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
            System.out.println("Saved content: ");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }


}

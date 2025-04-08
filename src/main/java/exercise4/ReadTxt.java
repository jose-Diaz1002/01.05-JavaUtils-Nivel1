package exercise4;

import java.io.*;

public class ReadTxt {

    public static void readFile(String path) {

        try {
            FileReader reader = new FileReader(path);
            BufferedReader mybuffer = new BufferedReader(reader);
            String line;

            while ((line = mybuffer.readLine()) != null) {
                String[] parts = line.split(" ");
                System.out.println(line);

            }
            reader.close();

        } catch (IOException e) {

            System.out.println("file not found");
        }

    }
}

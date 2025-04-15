package exercise1;

import java.io.File;

public class Directories {

    public static void listDirectoryContents(String path) {
        File file = new File(path);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("The directory does not exist or is invalid: " + path);
            return;
        }

        String[] namesFiles = file.list();

        if (namesFiles == null || namesFiles.length == 0) {
            System.out.println("The directory does not exist or is invalid:");
            return;
        }

        for (String name : namesFiles) {
            System.out.println(name);
        }
    }
}

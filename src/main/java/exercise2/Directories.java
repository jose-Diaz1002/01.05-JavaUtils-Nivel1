package exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directories {

    public static void directoriesSorts(String path) {
        File file = new File(path);

        String[] namesFiles = file.list();
        SimpleDateFormat modificationDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (int i = 0; i < namesFiles.length; i++) {

            File markDirectoriesFiles = new File(file.getAbsolutePath(), namesFiles[i]);

            if (markDirectoriesFiles.isDirectory()) {

                System.out.println("[D] " + namesFiles[i] + " Date: " +
                        modificationDate.format(new Date(markDirectoriesFiles.lastModified())));

                String[] subDirectory = markDirectoriesFiles.list();

                for (int j = 0; j < subDirectory.length; j++) {

                    System.out.println("    --> " + subDirectory[j]);
                }

            } else {
                System.out.println("[F] " + namesFiles[i] + " Date: " +
                        modificationDate.format(new Date(markDirectoriesFiles.lastModified())));

            }
        }

    }
}


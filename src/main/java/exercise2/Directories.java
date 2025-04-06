package exercise2;

import java.io.File;

public class Directories {

    public static void DirectoriesSorts(String path) {
        File file = new File(path);

        String[] namesFiles = file.list();

        for (int i = 0; i < namesFiles.length; i++) {

            File markDirectoriesFiles = new File(file.getAbsolutePath(), namesFiles[i]);

            if (markDirectoriesFiles.isDirectory()) {

                System.out.println("[D] " + namesFiles[i]);
                String[] subDirectory = markDirectoriesFiles.list();

                for (int j = 0; j < subDirectory.length; j++) {

                    System.out.println("    --> " + subDirectory[j]);
                }

            } else {
                System.out.println("[F] " + namesFiles[i]);

            }

        }
    }
}

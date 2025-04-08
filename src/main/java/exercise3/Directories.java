package exercise3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directories {

    public static String directoriesSorts(String path) {

        File file = new File(path);
        String content = "";

        String[] namesFiles = file.list();
        SimpleDateFormat modificationDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        for (String name : namesFiles) {

            File markDirectoriesFiles = new File(file.getAbsolutePath(), name);

            if (markDirectoriesFiles.isDirectory()) {

                content += "[D]" + name + " Date: " +
                        modificationDate.format(new Date(markDirectoriesFiles.lastModified())) + "\n";
            }

            if (markDirectoriesFiles.isDirectory()) {

                String[] subDirectory = markDirectoriesFiles.list();

                for (String sub : subDirectory) {

                    content += "   --> " + sub + "\n";
                }

            } else {
                content += "[F]" + name + "\n";

            }

        }
        return content;
    }
}






















package exerise3;

import java.io.File;

public class Directories {

    public static String DirectoriesSorts(String path) {
        File file = new File(path);
        String content = "";

        String[] namesFiles = file.list();

        for (String name : namesFiles) {

            File markDirectoriesFiles = new File(file.getAbsolutePath(), name);

            if (markDirectoriesFiles.isDirectory()) {

                content += "[D]"+ name + "\n";
            }

            if(markDirectoriesFiles.isDirectory()){

                String[] subDirectory = markDirectoriesFiles.list();

                for (String sub : subDirectory) {

                    content += "   --> " + sub + "\n";
                }

            } else {
                content += "[F]" + name +  "\n";

            }

        }
        return content;
    }
}






















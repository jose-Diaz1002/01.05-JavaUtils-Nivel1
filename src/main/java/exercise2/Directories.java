package exercise2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Directories {

    public static void listDirectoryContents(String path) {
        File file = new File(path);

        if (!file.exists() || !file.isDirectory()) {
            System.out.println("La ruta no existe o no es un directorio.");
            return;
        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        listDirectoryTree(file, 0, formatter);
    }

    private static void listDirectoryTree(File dir, int level, SimpleDateFormat dateFormat) {
        File[] contents = dir.listFiles();
        if (contents == null) return;

        Arrays.sort(contents, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        for (File file : contents) {
            String indent = "    ".repeat(level);
            String type = file.isDirectory() ? "[D]" : "[F]";
            String formattedDate = dateFormat.format(new Date(file.lastModified()));

            System.out.println(indent + type + " " + file.getName() + "   -Date: " + formattedDate);

            if (file.isDirectory()) {
                listDirectoryTree(file, level + 1, dateFormat);
            }
        }
    }
}




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
/*
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Directories {

    public static void DirectoriesSorts(String path) {
        File root = new File(path);
        if (!root.exists() || !root.isDirectory()) {
            System.out.println("La ruta no es válida o no es un directorio.");
            return;
        }

        listRecursive(root, 0);
    }

    private static void listRecursive(File dir, int level) {
        File[] files = dir.listFiles();

        if (files == null) return;

        // Ordenar alfabéticamente
        Arrays.sort(files, (f1, f2) -> f1.getName().compareToIgnoreCase(f2.getName()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (File file : files) {
            String indent = "    ".repeat(level);
            String type = file.isDirectory() ? "[D]" : "[F]";
            String lastModified = sdf.format(new Date(file.lastModified()));
            System.out.println(indent + type + " " + file.getName() + " (modificado: " + lastModified + ")");

            // Si es directorio, continuar recursivamente
            if (file.isDirectory()) {
                listRecursive(file, level + 1);
            }
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        String path = "ruta/a/tu/directorio"; // ← cambia esto por una ruta válida
        DirectoriesSorts(path);
    }
}

 */

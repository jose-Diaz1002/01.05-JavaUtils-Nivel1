package exercise1;


import java.io.File;
import java.util.Arrays;

public class Directories {

    public static void DirectoriesSorts1(String path) {
        File file = new File(path);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
    }

    public static void DirectoriesSorts(String path) {
        File file = new File(path);
        String[] namesFiles = file.list();
        for (int i = 0; i < namesFiles.length; i++) {
            System.out.println(namesFiles[i]);
        }
    }
}

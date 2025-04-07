package exercise3;

public class Main {

    public static void main(String[] args) {

        String path ="src/main/resources/pruebasDir";
        String outFilePath ="src/main/java/exerise3/txt/directories.txt";

        String result = Directories.DirectoriesSorts(path);

        SaveTxt.writeToFile(result,outFilePath);
    }
}

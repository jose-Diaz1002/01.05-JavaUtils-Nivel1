package exercise3;

import static exercise3.Directories.getDirectoryStructure;
import static exercise3.SaveTxt.writeToFile;

public class Main {

    public static void main(String[] args) {

        if (args.length == 2) {

            writeToFile(getDirectoryStructure(args[0]), args[1]);
        } else {
            System.out.println("The path address of the directories is incorrect or does not exist.");

        }

    }
}

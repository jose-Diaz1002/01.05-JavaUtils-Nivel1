package exercise2;

import static exercise2.Directories.directoriesSorts;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            directoriesSorts(args[0]);
        } else {
            System.out.println("The path address of the directories is incorrect or does not exist.");

        }

    }
}

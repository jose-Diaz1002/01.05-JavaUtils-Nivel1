package exercise4;

import static exercise4.ReadTxt.readFile;

public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            readFile(args[0]);
        } else {
            System.out.println("The path address of the directories is incorrect or does not exist.");

        }

    }

}

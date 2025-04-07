package exercise1;

public class Main {
    public static void main(String[] args) {

        String path = "src/main/resources/pruebasDir";
        if(path.length() == 0){
            System.out.println("The path address of the directories is incorrect or does not exist.");
        }else{
            Directories.DirectoriesSorts(path);
            }
    }
}

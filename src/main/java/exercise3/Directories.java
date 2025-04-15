package exercise3;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Directories {

    public static String getDirectoryStructure(String path) {
        File rootDirectory = new File(path);
        StringBuilder result = new StringBuilder();

        String[] directoryEntries = rootDirectory.list();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        if (directoryEntries != null) {
            for (String entryName : directoryEntries) {
                File entry = new File(rootDirectory.getAbsolutePath(), entryName);

                if (entry.isDirectory()) {
                    result.append("[D] ")
                            .append(entryName)
                            .append(" - Date: ")
                            .append(dateFormatter.format(new Date(entry.lastModified())))
                            .append("\n");

                    String[] childItems = entry.list();
                    if (childItems != null) {
                        for (String child : childItems) {
                            result.append("   --> ").append(child).append("\n");
                        }
                    }
                } else {
                    result.append("[F] ").append(entryName).append("\n");
                }
            }
        } else {
            result.append("Directory does not exist or is not accessible.\n");
        }

        return result.toString();
    }

}






















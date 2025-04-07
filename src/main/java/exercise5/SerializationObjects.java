package exercise5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationObjects {

    public static void serielization(ArrayList<Persona> personas, String filePath) {

        try {
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(filePath));
            writeFile.writeObject(personas);
            System.out.println("Object serialized successfully");
            writeFile.close();

        } catch (Exception e) {
            System.out.println("Error serializing the object");
        }

    }

}

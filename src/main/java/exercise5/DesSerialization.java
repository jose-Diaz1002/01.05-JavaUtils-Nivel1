package exercise5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DesSerialization {

    public static ArrayList<Persona> deserializeObjects(String filePath) {

        try {
            ObjectInputStream readFile = new ObjectInputStream(new FileInputStream(filePath));
            ArrayList<Persona> writePersona = (ArrayList<Persona>) readFile.readObject();
            System.out.println("Objects deserialized successfully");
            return writePersona;
        } catch (Exception e) {
            System.out.println("Error deserializing the object");
            return null;
        }

    }
}

package exercise5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jose", 47));
        personas.add(new Persona("Manuela", 10));
        personas.add(new Persona("Martina", 13));

        String filePath = "src/main/resources/pruebasDir/personas.txt";

        SerializationObjects.serielization(personas, filePath);
        ArrayList<Persona> personasDeserialization = DesSerialization.deserializeObjects(filePath);

        personasDeserialization.forEach(System.out::println);


    }
}

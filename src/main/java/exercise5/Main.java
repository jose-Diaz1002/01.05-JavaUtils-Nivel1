package exercise5;

import java.util.ArrayList;

import static exercise5.SerializationObjects.serielization;
import static exercise5.DesSerialization.deserializeObjects;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jose", 47));
        personas.add(new Persona("Manuela", 10));
        personas.add(new Persona("Martina", 13));

        if (args.length > 0) {
            serielization(personas, args[0]);
            ArrayList<Persona> personasDeserialization = deserializeObjects(args[0]);
            personasDeserialization.forEach(System.out::println);
        } else {
            System.out.println("The path address of the directories is incorrect or does not exist.");

        }

    }
}

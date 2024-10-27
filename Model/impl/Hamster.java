package Model.impl;

//import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Hamster extends PackedAnimal {
    private static String Animaltype = "Хомяк";

    public Hamster(int id, String name, String type, ArrayList<String> commands) {
        super(id, name, type, commands);
    }
}

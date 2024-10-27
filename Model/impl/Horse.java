package Model.impl;

//import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Horse extends PackedAnimal {
    private static String Animaltype = "Лошадь";

    public Horse(int id, String name, String type, ArrayList<String> commands) {
        super(id, name, type, commands);
    }
}

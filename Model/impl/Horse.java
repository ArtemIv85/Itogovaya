package Model.impl;

import Model.Animal;

import java.util.List;

public class Horse extends Animal {
    private static String Animaltype = "Лошадь";

    public Horse(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

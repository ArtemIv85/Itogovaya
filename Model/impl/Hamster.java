package Model.impl;

import Model.Animal;

import java.util.List;

public class Hamster extends Animal {
    private static String Animaltype = "Хомяк";

    public Hamster(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

package Model.impl;

import Model.Animal;

import java.util.List;

public class Donkey extends Animal {
    private static String Animaltype = "Осел";

    public Donkey(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

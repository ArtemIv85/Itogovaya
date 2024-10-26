package Model.impl;

import Model.Animal;

import java.util.List;

public class PackedAnimal extends Animal {

    public PackedAnimal(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

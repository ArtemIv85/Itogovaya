package Model.impl;

import Model.Animal;

import java.util.List;

public class Dog extends Animal {
    private static String Animaltype = "Собака";

    public Dog(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

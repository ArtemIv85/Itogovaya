package Model.impl;

import Model.Animal;

import java.util.List;

public class Cat extends Animal {
    private static String Animaltype = "Кошка";

    public Cat(int id, String name, String animalType, List<String> commands) {
        super(id, name, animalType, commands);
    }
}

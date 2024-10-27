package Model.impl;

//import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Dog extends HomeAnimal {
    private static String Animaltype = "Собака";

    public Dog(int id, String name, String type, ArrayList<String> commands) {
        super(id, name, type, commands);
    }
}

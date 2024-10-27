package Model.impl;

//import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cat extends HomeAnimal {
    private static String Animaltype = "Кошка";

    public Cat(int id, String name, String type, ArrayList<String> commands) {
        super(id, name, type, commands);
    }
}

package Model.db;

import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class PetInDb {
    protected Animal Pet;
    protected List<String> comonds = new ArrayList<>();

    public PetInDb(Animal pet, List<String> comonds) {
        Pet = pet;
        this.comonds = comonds;
    }

    @Override
    public String toString() {
        return "PetInDb{" +
                "Pet=" + Pet +
                ", comonds=" + comonds +
                "} \n";
    }
}

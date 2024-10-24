package Model.db;

import Model.Animal;

import java.util.ArrayList;
import java.util.List;

public class PetInDb {
    protected  Animal Pet;
    protected  List<String> commondsList = new ArrayList<>();

    public PetInDb(Animal pet, List<String> comonds) {
        Pet = pet;
        this.commondsList = comonds;
    }

    @Override
    public String toString() {
        return "PetInDb{"+"Животное=" + Pet +", comonds=" + commondsList + "} \n";
    }

    public Animal getPet() {
        return Pet;
    }

    public void AddCommand(String command) {
        commondsList.addLast(command);
    }
    public void RemoveCommand(int ID){
        commondsList.remove(ID);
    }

    public void setPet(Animal pet) {
        Pet = pet;
    }

    public void setComonds(List<String> commonds) {
        this.commondsList = commonds;
    }

    public List<String> getCommondsList() {
        return commondsList;
    }
}

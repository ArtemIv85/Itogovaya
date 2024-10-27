package Model.impl;

import java.util.ArrayList;

public class Animal {
    int id;
    String name;
    String AnimalType;
    ArrayList<String> commands = new ArrayList<>();

    public Animal(int id, String name, String type, ArrayList<String> commands) {
        this.id = id;
        this.name = name;
        this.AnimalType = type;
        this.commands = commands;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public void setAnimalType(String type) {
        this.AnimalType = type;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }
    public void AddCommans(String command){
        this.commands.add(command);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + AnimalType + '\'' +
                ", commands=" + commands +
                "}\n";
    }
}


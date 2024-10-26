package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public  class Animal {
    protected int id;
    protected String Name;
    protected String AnimalType;
    public List<String> commands = new ArrayList<>();
    //protected LocalDate birthday;


    public Animal(int id, String name, String animalType, List<String> commands) {
        this.id = id;
        Name = name;
        AnimalType = animalType;
        this.commands = commands;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public Animal(int id, String name,String type) {
        this.id = id;
        Name = name;
        AnimalType = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", AnimalType='" + AnimalType + '\'' +
                ", commands=" + commands +
                "}\n";
    }
}
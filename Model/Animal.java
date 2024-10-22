package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    protected int id;
    protected String Name;
    //protected LocalDate birthday;



    public Animal(int id, String name) {
        this.id = id;
        Name = name;
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
                '}';
    }
}
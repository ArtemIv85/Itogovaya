package service;

import Model.Animal;
import Model.db.DataBase;
import Model.db.PetInDb;

import java.util.ArrayList;
import java.util.List;

public class FindAnimal {
    public static List<Animal> Find(int id, String Name){
        List<Animal> PetList = new ArrayList<>();
        int findcount=0;
        if (id!=0){//Поиск по ID
            for (Animal pet:DataBase.PetsDataBase) {
                if (pet.getId()==id) {
                    PetList.add(pet);
                    findcount++;
                }
            }

        }
        else {//Поиск по имени без учета регистра
            for (Animal pet:DataBase.PetsDataBase){
                if (pet.getName().toLowerCase().contains(Name.toLowerCase())){
                    PetList.add(pet);
                    findcount++;
                }
            }
        }
        if (findcount==0) System.out.println("Животное не найдено");
        else System.out.println("Найдено животных: "+findcount);
        return  PetList;
    }
}

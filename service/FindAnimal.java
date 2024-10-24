package service;

import Model.db.DataBase;
import Model.db.PetInDb;

import java.util.ArrayList;
import java.util.List;

public class FindAnimal {
    public static List<PetInDb> Find(int id, String Name){
        List<PetInDb> PetList = new ArrayList<>();
        int findcount=0;
        if (id!=0){//Поиск по ID
            for (PetInDb pet:DataBase.PetsDataBase) {
                if (pet.getPet().getId()==id) {
                    PetList.add(pet);
                    findcount++;
                }
            }

        }
        else {//Поиск по имени
            for (PetInDb pet:DataBase.PetsDataBase){
                if (pet.getPet().getName().contains(Name)){
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

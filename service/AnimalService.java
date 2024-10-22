package service;

import Model.Animal;
import Model.db.DataBase;
import Model.db.PetInDb;
import Model.impl.Cat;
import Model.impl.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalService {

    public Animal CreateAnimal(int id, String name, int animalclass) {
        switch (animalclass) {

            case 1 -> {
                System.out.println("Создание Кошки");
                List<String> commands = new ArrayList<>();//создаем список команд
                commands.add("Лежать");
                commands.add("Ждать"); //заполняем список команд
                Animal cat = new Cat(id, name);//создаем кошку
                PetInDb pet = new PetInDb(cat, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами
                System.out.println(cat);
                System.out.println(commands);
                System.out.println(DataBase.PetsDataBase.toString());
            }
            case 2 -> {
                return new Dog(id, name);
            }


        }
        return null;

    }
}
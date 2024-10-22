package service;

import Model.Animal;
import Model.db.DataBase;
import Model.db.PetInDb;
import Model.impl.Cat;
import Model.impl.Dog;
import Model.impl.Hamster;
import Model.impl.Horse;
import controller.Counter;
import view.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class AnimalService {

    public Animal CreateAnimal(int animalclass) {
        Scanner scanner = new Scanner(System.in);
        switch (animalclass) {

            case 1 -> {//Добавляем кошку
                System.out.println("Введите кличку Кошки:");
                String name = scanner.nextLine();

                new Counter().Add();
                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Cat(Counter.contpets, name,"Кошка");//создаем кошку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println(DataBase.PetsDataBase.toString());
            }
            case 2 -> {// Добавляем собаку
                System.out.println("Введите кличку Собаки:");
                String name = scanner.nextLine();

                new Counter().Add();
                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Dog(Counter.contpets, name,"Собака");//создаем кошку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println(DataBase.PetsDataBase.toString());
            }
            case 3 -> {// Добавляем Хомяка
                System.out.println("Введите кличку Хомяка:");
                String name = scanner.nextLine();

                new Counter().Add();
                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Hamster(Counter.contpets, name,"Хомяк");//создаем кошку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println(DataBase.PetsDataBase.toString());
            }
            case 4 -> {// Добавляем Лошадь
                System.out.println("Введите кличку Лошади:");
                String name = scanner.nextLine();

                new Counter().Add();
                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Horse(Counter.contpets, name,"Лошадь");//создаем кошку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println(DataBase.PetsDataBase.toString());
            }


        }
        return null;

    }


    public List<String> AddCommands(List<String> commands){ //функция добавления и удаления команд у животного

        Scanner scanner = new Scanner(System.in);
        int i=1;
        while (i==1) {
            System.out.println("Список команд: "+commands.toString());
            System.out.println("1 - Добавить команду");
            System.out.println("2 - Удалить команду");
            System.out.println("3 - Закончить");


            switch (scanner.nextInt()) {
                case 1 -> commands.add(SetCommand());
                //case 2 -> //Удаление команд

                case 3 -> i=0; // выход из приложения
                }

               // default -> System.out.println("Операция не поддерживается");
            }
            System.out.println();
        return commands;
        }

        public String SetCommand(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите команду: ");
            return scanner.nextLine();
        }



    }

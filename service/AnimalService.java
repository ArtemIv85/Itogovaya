package service;

import Model.Animal;
import Model.db.DataBase;
import Model.db.PetInDb;
import Model.impl.*;
import controller.Counter;
import view.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class AnimalService {

    public void CreateAnimal(int animalclass) {
        Scanner scanner = new Scanner(System.in);
        int id = DataBase.animalLastId+1;
        switch (animalclass) {

            case 1 -> {//Добавляем кошку
                System.out.println("Введите кличку Кошки:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Cat(id, name,"1");//создаем кошку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }
            case 2 -> {// Добавляем собаку
                System.out.println("Введите кличку Собаки:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Dog(id, name,"2");//создаем Собаку
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами
                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }
            case 3 -> {// Добавляем Хомяка
                System.out.println("Введите кличку Хомяка:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Hamster(id, name,"3");//создаем Хомяка
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }
            case 4 -> {// Добавляем Лошадь
                System.out.println("Введите кличку Лошади:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Horse(id, name,"4");//создаем Лошадь
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }
            case 5 -> {// Добавляем Верблюд
                System.out.println("Введите кличку Верблюда:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Animal animal1 = new Camel(id, name,"5");//создаем Верблюда
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }
            case 6 -> {// Добавляем Осла
                System.out.println("Введите кличку Осла:");
                String name = scanner.nextLine();


                System.out.println("Выберете навыки животного");

                List<String> commands = new ArrayList<>();//создаем список команд
                commands = AddCommands(commands); //заполняем список команд
                Donkey animal1 = new Donkey(id, name,"6");//создаем Осла
                PetInDb pet = new PetInDb(animal1, commands);//зоздаем запись кошки для базы данных
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами
                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }

        }



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
                case 2 -> RemoveCommand(commands); //Удаление команд

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

        //Функция удаления команды
        public List<String> RemoveCommand (List<String> commands){
            //Вывод списка команд с индексами
            Scanner scanner = new Scanner(System.in);
            int index = -1;
            for (int i=0;i<commands.size();i++){
                System.out.println(i+" - "+commands.get(i));
            }

            System.out.println("Укажите номер команды которую надо удалить");
            try{
                index = scanner.nextInt();
                if (index>=0 && index<commands.size()){
                    commands.remove(index);
                }
                else System.out.println("Неправильный номер команды");
            } catch (Exception e) {
                //throw new RuntimeException(e+"Неправильный номер команды");
                System.out.println("Неправильный номер команды");
            }


        return commands;
        }
    }

package service;

//import Model.Animal;
import Model.db.DataBase;
import Model.impl.*;
import controller.Counter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                Animal pet = new Cat(id, name,"1",DataBase.ListToArrayList(commands));//создаем кошку
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
                Animal pet = new Dog(id, name,"2",DataBase.ListToArrayList(commands));//создаем Собаку
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
                Animal pet = new Hamster(id, name,"3",DataBase.ListToArrayList(commands));//создаем Хомяка
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
                Animal pet = new Horse(id, name,"4",DataBase.ListToArrayList(commands));//создаем Лошадь
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
                Animal pet = new Camel(id, name,"5",DataBase.ListToArrayList(commands));//создаем Верблюда
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
                Animal pet = new Donkey(id, name,"6",DataBase.ListToArrayList(commands));//создаем Осла
                DataBase.PetsDataBase.add(pet);//добавляем в базу данных питомца с командами

                System.out.println("Вы добавили: ");
                System.out.println(pet);
                new Counter().Add();
            }

        }



    }
public void EditAnimal(int petId){

        for (Animal pet:DataBase.PetsDataBase){
            if (pet.getId()==petId){ //если есть такое животное с указанным ID
                int i=1;
                while (i==1) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Вы выбрали животное: ID = "+petId+" Имя: "+pet.getName());
                    System.out.println("Что нужно сделать?");
                    System.out.println("1 - Изменить имя");
                    System.out.println("2 - Добавить или удалить команду");
                    System.out.println("3 - Закончить");

                    try {
                        switch (scanner.nextInt()) {
                            case 1 -> {//изменение имени
                                System.out.println("Введите новое имя животного");
                                Scanner scanner1 = new Scanner(System.in);
                                pet.setName(scanner1.nextLine());
                            }

                            case 2 -> { // Изменения списка команд
                                List<String> petcommands = pet.getCommands();
                                pet.setCommands(DataBase.ListToArrayList(AddCommands(petcommands)));
                                System.out.println(pet.getCommands());

                            }

                            case 3 -> i = 0; // выход из приложения
                            default -> System.out.println("Операция не поддерживается");
                        }
                    } catch (Exception e) {
                        System.out.println("Операция не поддерживается");
                    }

                }


            }
        }

}


    public List<String> AddCommands(List<String> commands){ //функция добавления и удаления команд у животного

        int i=1;
        while (i==1) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Список команд: "+commands.toString());
            System.out.println("1 - Добавить команду");
            System.out.println("2 - Удалить команду");
            System.out.println("3 - Закончить");


            try {
                switch (scan.nextInt()) {
                    case 1 -> commands.add(SetCommand());
                    case 2 -> RemoveCommand(commands); //Удаление команд
                    case 3 -> i=0; // выход из приложения
                    default -> System.out.println("Операция не поддерживается");
               }
            } catch (Exception e) {
                System.out.println("Операция не поддерживается");
            }


        }
            System.out.println(commands);
        return commands;
        } //End  AddCommands

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
                System.out.println("Неправильный номер команды");
            }


        return commands;
        }
    }

package view;

import Model.Animal;
import Model.impl.*;

import java.util.Scanner;

public class menu {

    public void start() {

        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1 - Принять животное");
            System.out.println("2 - найти животное по Имени");
            System.out.println("3 - распечатать список всех животных");
            System.out.println("4 - Обучить новым командам");
            System.out.println("5 - Удалить команду у животного");
            System.out.println("6 - выход");

            switch (scanner.nextInt()) {
                case 1 -> new CreatAnimalMenu().start();
                //case 2 -> getById();
                //case 3 -> getAllStudents();
                //case 4 -> new StudentGroupView().start();
                //case 5 -> System.out.println(DataBase.studentGroups);
                case 6 -> System.exit(0);// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
        }
        }



        Animal cat1 = new Cat(1, "Мурка");
        Animal cat2 = new Cat(2, "Барсик");


    /*
    Animal dog1 = new Dog(2,"Жучка");
    Animal hamster1 = new Hamster(3,"Жорик");
    Animal horse1 = new Horse(4,"Корнет");
    Animal camel1 = new Camel(5,"Адам");
    Animal donkey1 = new Donkey(6,"Эдик");
    */
    }


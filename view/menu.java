package view;

//import Model.Animal;
import Model.db.DataBase;
import Model.impl.*;
import controller.Counter;
import service.AnimalService;
import service.EditAnimalService;

import java.util.Scanner;

public class menu {

    public void start() {





//        System.out.println("Количество животных в базе: "+ Counter.contpets);
//        System.out.println(DataBase.PetsDataBase.get(1));
//        DataBase.PetsDataBase.get(1).AddCommand("sdfsdgsgsdg");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - Принять животное");
            System.out.println("2 - найти животное по Имени");
            System.out.println("3 - распечатать список всех животных");
            System.out.println("4 - Редактировать животного(Изменить имя и команды");
            System.out.println("5 - Сохранить изменения в файле");
            System.out.println("6 - Сохранить и выйти");

            try {
                switch (scanner.nextInt()) {
                    case 1 -> new CreatAnimalMenu().start();
                    case 2 -> new FindAnimalMenu().start();
                    case 3 -> System.out.println(DataBase.PetsDataBase.toString());
                    case 4 -> new EditAnimalService().start();
                    case 5 -> DataBase.SaveDB();
                    case 6 -> {
                                DataBase.SaveDB();
                                System.exit(0);// выход из приложения
                    }

                    default -> System.out.println("Операция не поддерживается");
                }
            } catch (Exception e) {
                System.out.println("Операция не поддерживается");
            }
        }
        }





    /*
    Animal dog1 = new Dog(2,"Жучка");
    Animal hamster1 = new Hamster(3,"Жорик");
    Animal horse1 = new Horse(4,"Корнет");
    Animal camel1 = new Camel(5,"Адам");
    Animal donkey1 = new Donkey(6,"Эдик");
    */
    }


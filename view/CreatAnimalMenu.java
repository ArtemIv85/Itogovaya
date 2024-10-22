package view;

import service.AnimalService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CreatAnimalMenu {
    public void start(){


        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("1 - Кошка");
            System.out.println("2 - Собака");
            System.out.println("3 - Хомяк");
            System.out.println("4 - Лошадь");
            System.out.println("5 - Верблюд");
            System.out.println("6 - Осел");
            System.out.println("7 - Обратно");

            switch (scanner.nextInt()) {
                case 1 -> new AnimalService().CreateAnimal(1,"Мурка",1);
                //case 2 -> getById();
                //case 3 -> getAllStudents();
                //case 4 -> new StudentGroupView().start();
                //case 5 -> System.out.println(DataBase.studentGroups);
               // case 6 -> System.exit(0);// выход из приложения
                case 7 -> new menu().start();// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
            System.out.println();
        }

    }
}

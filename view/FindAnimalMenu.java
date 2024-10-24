package view;

import service.AnimalService;
import service.FindAnimal;

import java.util.Scanner;

public class FindAnimalMenu {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Искать по ID или Имя животного?");
            System.out.println("1 - ID");
            System.out.println("2 - Имя");
            System.out.println("3 - Отмена");

            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Введите ID животного:");
                    System.out.println(FindAnimal.Find(scanner.nextInt(), ""));
                }

                case 2 -> {
                    System.out.println("Введите Имя животного:");
                    scanner.nextLine();
                    System.out.println(FindAnimal.Find(0,scanner.nextLine()));
                }
                case 3 -> new menu().start();// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
        }
    }
}

package service;

//import Model.Animal;
import Model.db.DataBase;
import Model.impl.Animal;
import view.menu;

import java.util.Scanner;

public class EditAnimalService {
    public void start() {
        int ID;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Укажите ID животного для изменения");

                ID = scanner.nextInt();
                for (Animal pet : DataBase.PetsDataBase) {
                    if (pet.getId() == ID) {
                        System.out.println("Выбрано животное ID: " + ID + " Имя: " + pet.getName());
                        //Scanner sc1 = new Scanner(System.in);
                        System.out.println("1 - Изменить Имя");
                        System.out.println("2 - Добавить команду");
                        System.out.println("3 - Удалить команду");
                        System.out.println("4 - Вернуться в главное меню");
                        switch (scanner.nextInt()) {

                            case 1 -> {//Изменение имени
                                Scanner sc2 = new Scanner(System.in);
                                System.out.println("Введите новое имя животного: ");
                                pet.setName(sc2.nextLine());
                                new menu().start();
                            }
                            case 2 -> {//Добавление команды
                                System.out.println("Изученные команды: " + pet.getCommands());

                                Scanner sc3 = new Scanner(System.in);
                                System.out.println("Введите новую команду: ");
                                pet.getCommands().add(sc3.nextLine());
                                System.out.println("Команда добавлена.");
                                new menu().start();
                            }
                            case 3 -> {//Удаление команды
                                //Вывод изученых команд с нумерацией
                                int index = -1;
                                for (int i = 0; i < pet.getCommands().size(); i++) {
                                    System.out.println(i + " - " + pet.getCommands().get(i));
                                }
                                // конец вывода команд
                                Scanner sc4 = new Scanner(System.in);
                                System.out.println("Укажите номер команды, которую надо удалить");
                                try {
                                    pet.getCommands().remove(scanner.nextInt());
                                    System.out.println("Команда удалена.");
                                    new menu().start();
                                } catch (Exception e) {
                                    System.out.println("Неправильный номер команды");
                                }
                            }
                            case 4 -> new menu().start();
                            default -> System.out.println("Операция не поддерживается");
                        }


                    }
                }

             /*   System.out.println();


                switch (scanner.nextInt()) {
                    case 1 -> new CreatAnimalMenu().start();
                    case 2 -> new FindAnimalMenu().start();
                    case 3 -> System.out.println(DataBase.PetsDataBase.toString());
                    case 4 -> {
                        Scanner scanner1 = new Scanner(System.in);
                        System.out.println("Введите ID животного для изменения");
                        new AnimalService().EditAnimal(scanner1.nextInt());
                    }
                    //case 5 -> System.out.println(DataBase.studentGroups);
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
        */

        }//End while


    }//End start

}// End EditAnimalService

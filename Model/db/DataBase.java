package Model.db;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Animal;
import Model.impl.*;
import controller.Counter;

//симулирует базу данных
public class DataBase {
    public static final List<PetInDb> PetsDataBase = new ArrayList<>();
    public static int animalLastId=0;

/*
Структура данных
Pet                                             Commonds (Lis<String>)
int id  String name   String Type              ArrayList<String>
 */
    public static void LoadDB() {

        BufferedReader reader = null;
        try {
            int maxId=0;
            int count = 0;
            reader = new BufferedReader(new FileReader("DB.txt")); //Чтение файла базы данных в буфер
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strarr = line.split("/");
                int id = Integer.parseInt(strarr[0]);
                String Name = strarr[1];
                String AnimalType = strarr[2];
                List<String> commans = new ArrayList<>();
                if (strarr.length>3) commans = Arrays.asList(strarr[3].split(","));//если список команд не пуст

                switch (Integer.parseInt(AnimalType)) {
                    case 1 -> {// 1 - Кошка
                        PetInDb pet = new PetInDb(new Cat(id,Name,AnimalType),commans);
                        DataBase.PetsDataBase.add(pet);
                    }
                    case 2 -> {//2 - Собака
                        PetInDb pet = new PetInDb(new Dog(id,Name,AnimalType),commans);
                        DataBase.PetsDataBase.add(pet);
                    }
                    case 3 -> {// 3 - Хомяк
                        PetInDb pet = new PetInDb(new Hamster(id,Name,AnimalType),commans);
                        DataBase.PetsDataBase.add(pet);
                    }
                    case 4 -> {//4 - Лошадь
                        PetInDb pet = new PetInDb(new Horse(id,Name,AnimalType), commans);
                        DataBase.PetsDataBase.add(pet);
                    }
                    case 5 -> {// 5 - Верблюд
                        PetInDb pet = new PetInDb(new Camel(id,Name,AnimalType),commans);
                        DataBase.PetsDataBase.add(pet);
                    }
                    case 6 -> { // 6 - Осел
                        PetInDb pet = new PetInDb(new Donkey(id,Name,AnimalType),commans);
                        DataBase.PetsDataBase.add(pet);
                    }

                }
                System.out.println();
                if (maxId<id) maxId=id;
                new Counter().Add();


            }
            System.out.println("Загружено животных из базы: "+Counter.contpets);
            reader.close();



        } catch (FileNotFoundException e) {
            System.out.println("Файл DB.txt не найден");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }// конец LoadDB




    public static void SaveDB(){


            File file = new File("DB.txt");
            file.delete();
        try {
            if (file.createNewFile()) {
                System.out.println("Файл создан");
                FileWriter writer = new FileWriter("DB.txt");

                for (PetInDb pet:DataBase.PetsDataBase){
                    String commands="";
                    for (String com:pet.comonds){
                        commands=commands+com+",";
                    }
                    commands=commands.substring(0,commands.length()-1);
                    writer.write(pet.getPet().getId()+"/"
                                    +pet.getPet().getName()+"/"
                                    +pet.getPet().getAnimalType()+"/"
                                    +commands
                                    +"\n"
                                );
                }
                writer.close();

            } else {
                System.out.println("Файл занят другим приложением");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }





    }

}

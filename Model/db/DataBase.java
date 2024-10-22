package Model.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Model.Animal;

//симулирует базу данных
public class DataBase {
    public static final List<PetInDb> PetsDataBase = new ArrayList<>();
    public static int animalLastId=0;



    /*
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static int teacherLastId=0;

    public static final List<StudentGroup> studentGroups = new ArrayList<>();
*/


    public static void fillDB(){
        String[] commanArr = {"Сидеть","Лежать","Ждать"};
        //HomeAnimals h1 = new HomeAnimals(animalLastId+1,"Шарик","Домашнее животное", Arrays.asList(commanArr));


/*
        Teacher teacher = new Teacher(1, "Вася", "Иванов");
        teachersDB.add(teacher);
        teacherLastId = teacherLastId+1;
        Teacher teacher2 = new Teacher(2, "Самуил", "Яковлевич");
        teachersDB.add(teacher2);
        teacherLastId = teacherLastId+1;


        Student s1 = new Student(1, "Рикон", "Старк");
        studentsDB.add(s1);
        studentLastId=studentLastId+1;
        Student s2 = new Student(2, "Джофри", "Ланистер");
        studentsDB.add(s2);
        studentLastId=studentLastId+1;*/
    }

}

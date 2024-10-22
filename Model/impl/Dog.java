package Model.impl;

public class Dog extends HomeAnimal {
    private static String Animaltype = "Собака";
    public Dog(int id,String Name,String type){
        super(id,Name,type);

    }

    public static String getAnimaltype() {
        return Animaltype;
    }
}

import Model.db.DataBase;
import view.menu;

public class Main {
    public static void main(String[] args) {
        DataBase.LoadDB();
        new menu().start();
    }
}

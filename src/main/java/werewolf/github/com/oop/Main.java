package werewolf.github.com.oop;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Book {
    String name = "default";
    long ID = 0;

    public static final char STUD_OWN = 0;
    public static final char MANA_OWN = 1;
    char owner = MANA_OWN;
    Book() {
    }

    Book(String newName, long newID){
        name = newName;
        ID = newID;
    }

    void Lended(){
        owner = STUD_OWN;
    }

    void Borrowed(){
        owner = MANA_OWN;
    }

}

class Undergraduate {
    String name = "default";
    long ID = 0;
    Undergraduate() {
    }

    Undergraduate(String newName, long newID){
        name = newName;
        ID = newID;
    }
}

class BookManager {
    String name = "default";
    long ID = 0;
    BookManager() {
    }

    BookManager(String newName, long newID){
        name = newName;
        ID = newID;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
//第六次课确定，如果确定A类，联系老师，有奖励
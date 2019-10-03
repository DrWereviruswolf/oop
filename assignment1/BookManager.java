package werewolf.github.com.oop;


public class BookManager {
    String name = "default";
    long ID = 0;
    BookManager() {
    }

    BookManager(String newName, long newID){
        name = newName;
        ID = newID;
    }

    long LendABook(Book book, Undergraduate student){
        book.Lended();
        return student.ID;
    }

    long RecieveABook(Book book, Undergraduate student){
        book.Returned();
        return student.ID;
    }
}

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
    void Returned(){
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

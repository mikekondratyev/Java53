package Lesson4.cloning;

public class CloneTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book warAndPeace = new Book("War and Peace" , 1825);
        // Book someBook = warAndPeace; // копируется только ссылка, не сам объект
    Book anotherBook = warAndPeace.clone();



    }






}

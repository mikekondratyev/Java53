package Lesson4.cloning;

public class CloneTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author leo = new Author("Leo Fat");

        Book warAndPeace = new Book("War and Peace", 1825, leo);
        // Book someBook = warAndPeace; // копируется только ссылка, не сам объект
    Book anotherBook = warAndPeace.clone();
anotherBook.setYear(2023);
Author orwell = new Author("Georgw ORWELL");
//anotherBook.setName("Trrray");
anotherBook.setAuthor(orwell);
        System.out.println(anotherBook);
        System.out.println(warAndPeace);

    }






}

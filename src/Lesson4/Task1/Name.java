package Lesson4.Task1;

public class Name {

    public static void main(String[] args) {

        Author author = new Author(" лев ", "Толстой");
        Book book = new Book("Война и мир", 1, 1861, new Author[]{author});
        Storage libraries = new Storage(20);
        libraries.AddBook(book);
        System.out.println(libraries);

    }
}

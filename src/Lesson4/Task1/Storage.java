package Lesson4.Task1;

import Lesson4.Task1.Book;

import java.util.Arrays;

public class Storage {
    private int sizeofStorage;
    String book;
    String oneStorage[] = new String[20];
    Book[] books = new Book[20];


    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }


    public Storage(int sizeofStorage) {
        if (sizeofStorage > 20) {
            throw new IllegalArgumentException("максимальное значение 20");
        } else {
            this.sizeofStorage = sizeofStorage;
        }
    }

    public void AddBook(Book book) {
        for (int i = 0; i < books.length; i++) {

            if (books[i] == null) {
                books[i] = book;
                return;


            }
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "sizeofStorage=" + sizeofStorage +
                ", book='" + book + '\'' +
                ", oneStorage=" + Arrays.toString(oneStorage) +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}

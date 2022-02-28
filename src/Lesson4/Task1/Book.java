package Lesson4.Task1;

import Lesson4.Task1.Author;

import java.util.Arrays;

public class Book {
    private String nameBook;
    private int numberOfPages;
    private int publicationYear;
    private Author[] author;


    public Book(String nameBook, int numberOfPages, int publicationYear, Author[] author) {
        setName(nameBook);
        setNumberOfPages(numberOfPages);
        setPublicationYear(publicationYear);
        setAuthor(author);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public String getName() {
        return nameBook;
    }

    public void setName(String name) {
        this.nameBook = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("такой книги не существует");

        } else {
            this.numberOfPages = numberOfPages;
        }

    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        if (publicationYear > 2022) {
            throw new IllegalArgumentException("год выпуска книги больше текущего года");
        } else {
            this.publicationYear = publicationYear;
        }

    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", publicationYear=" + publicationYear +
                ", author=" + Arrays.toString(author) +
                '}';
    }
}

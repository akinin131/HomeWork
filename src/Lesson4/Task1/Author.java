package Lesson4.Task1;

import java.util.Arrays;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;


    public Author(String nameAuthor, String surnameAuthor) {
        setNameAuthor(nameAuthor);
        setSurnameAuthor(surnameAuthor);
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                '}';
    }

}

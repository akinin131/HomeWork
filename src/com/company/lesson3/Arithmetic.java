package com.company.lesson3;

public class Arithmetic {
    int x;
    int y;

    public void setX(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Введите значение больше 0");
        }
        {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (y <= 0) {
            throw new IllegalArgumentException("Введите значение больше 0");
        } else {
            this.y = y;
        }
    }
}

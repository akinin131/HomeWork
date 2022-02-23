package Lesson4.Task2;

import java.util.Arrays;

public class Cat {
    private String name;
    private String color;
    private double speed;
    private double weight;
    private Mouse[] countMouses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.trim().length() < 2) throw new IllegalArgumentException("вы ввели ошибочное имя");
        else
            this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.trim().length() < 2) throw new IllegalArgumentException("вы ввели ошибочный цвет");
        else
            this.name = name;
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed < 0)
            throw new IllegalArgumentException("cкорость меньше нуля");
        else
            this.speed = speed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0)
            throw new IllegalArgumentException("вес должен быть бульше нуля");
        else
            this.weight = weight;
    }

    public Mouse[] getCountMouses() {
        return countMouses;
    }

    public void setCountMouses(Mouse[] countMouses) {
        this.countMouses = countMouses;
    }

    public Cat(String name, String color, double speed, double weight, Mouse[] countMouses) {
        setName(name);
        setColor(color);
        setSpeed(speed);
        setWeight(weight);
        setCountMouses(countMouses);
    }

    public void catL(Mouse mouse) {
        if (mouse.getSpeed() > getSpeed()) {
            System.out.println("Мыш убежала");
        } else
            System.out.println("кот поймал мыш");
    }


}

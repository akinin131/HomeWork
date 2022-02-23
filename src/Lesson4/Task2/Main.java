package Lesson4.Task2;

public class Main {
    // не успел выполнить доп задание, скоро добавлю
    // не успел выполнить доп задание, скоро добавлю
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", "red", 20.0, 15, new Mouse[2]);


        Mouse mouse = new Mouse(18);
        Mouse mouse1 = new Mouse(31);

        cat.catL(mouse1);
        cat.catL(mouse);
    }
}

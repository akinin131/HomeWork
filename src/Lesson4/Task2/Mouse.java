package Lesson4.Task2;

public class Mouse {
    private int speed;
    Cat cat = new Cat("Tom", "red", 20.0, 15, new Mouse[6]);

    public int getSpeed() {
        return speed;
    }

    public Mouse(int speed) {
        setSpeed(speed);
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            throw new IllegalArgumentException("cкорость меньше нуля");
        } else {
            this.speed = speed;
        }
    }


}

package Lesson5.Task2;

public class Guitar implements InterfaceInstruments {

    private int countString;

    @Override
    public void play() {

    }

    public Guitar(int countString) {
        setCountString(countString);
    }

    public int getCountString() {
        return countString;
    }

    public void setCountString(int countString) {
        if (countString < 0) {
            throw new IllegalArgumentException("вы не ввели количество струн");
        } else {
            this.countString = countString;
        }
    }

    @Override
    public String toString() {
        return "Играет инструмент: Гитара{" +
                "количество струн='" + countString + '\'' +
                '}';
    }

}

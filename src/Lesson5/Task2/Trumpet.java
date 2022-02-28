package Lesson5.Task2;

public class Trumpet implements InterfaceInstruments {
    private int trumpetDeametr;

    @Override
    public void play() {

    }

    public Trumpet(int trumpetDeametr) {
        this.trumpetDeametr = trumpetDeametr;
    }

    public int getTrumpetDeametr() {
        return trumpetDeametr;
    }

    public void setTrumpetDeametr(int trumpetDeametr) {
        this.trumpetDeametr = trumpetDeametr;
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "trumpetDeametr=" + trumpetDeametr +
                '}';
    }
}

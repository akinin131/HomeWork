package Lesson5.Task2;

public class Drum implements InterfaceInstruments {
    private String size;

    @Override
    public void play() {

    }

    public Drum(String size) {
        if (size.trim().isEmpty()) {
            throw new IllegalArgumentException("Вы не ввели размер");
        } else
            setSize(size);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        this.size = size;
    }

    @Override
    public String toString() {
        return "Играет инструмент: Барабан{" +
                "размер='" + size + '\'' +
                '}';
    }
}

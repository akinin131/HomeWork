package Lesson5.Task1;

import java.util.Objects;



public class IPhone {
    private String model;
    private String material;
    private int weight;
    private int width;  // ширина
    private int countSim;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IPhone iPhone = (IPhone) o;
        return weight == iPhone.weight && width == iPhone.width && countSim == iPhone.countSim && Objects.equals(model, iPhone.model) && Objects.equals(material, iPhone.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, material, weight, width, countSim);
    }


    public IPhone(String model, String material, int weight, int width, int countSim) {

        setModel(model);
        setCountSim(countSim);
        setMaterial(material);
        setWidth(width);
        setWeight(weight);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.trim().isEmpty()) {
            throw new IllegalArgumentException("Введите модель");

        } else {
            this.model= model;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (model.trim().isEmpty()) {
            throw new IllegalArgumentException("вы не ввели материал");

        } else {
            this.material= material;
        }
    }



    public void setWeight(int weight) {
        if (width < 0) {
            throw new IllegalArgumentException("вы не ввели длину");

        } else {
            this.weight= weight;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("вы не ввели ширину");

        } else {
            this.weight= width;
        }
    }

    public int getCountSim() {
        return countSim;
    }

    public void setCountSim(int countSim) {
        if (countSim <= 0) {
            throw new IllegalArgumentException("вы не ввели количество сим");

        } else {
            this.countSim= countSim;
        }
    }
    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", width=" + width +
                ", countSim=" + countSim +
                '}';
    }

}



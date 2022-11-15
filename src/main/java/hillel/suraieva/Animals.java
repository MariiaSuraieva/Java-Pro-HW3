package hillel.suraieva;

import java.util.Objects;

public class Animals {
    private String name;

    private static int colAnimals = 0;

    public Animals(String name) {
        this.name = name;
        colAnimals++;

    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return getName().equals(animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    public void run(int distance) {

    }

    public void swim(int distance) {

    }

    public static int getColAnimals() {
        return colAnimals;
    }
}

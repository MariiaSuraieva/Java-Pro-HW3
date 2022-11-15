package hillel.suraieva;

public class Dog extends Animals {

    int maxRun = 500;
    int maxSwim = 10;

    public static int colDogs = 0;

    public Dog(String name) {
        super(name);
        colDogs++;
    }


    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }


    public void run(int distance) {
        if (distance <= maxRun)
            System.out.println("Собака " + getName() + " пробежал(а) " + distance + " м.");
        else
            System.out.println("Собака " + getName() + " не может пробежать " + distance + " м.");
    }

    public void swim(int distance) {
        if (distance <= maxSwim)
            System.out.println("Собака " + getName() + " проплыл(а) " + distance + " м.");
        else
            System.out.println("Собака " + getName() + " не может проплыть " + distance + " м.");
    }

    public static int getColDogs() {
        return colDogs;
    }
}

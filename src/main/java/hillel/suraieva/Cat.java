package hillel.suraieva;

public class Cat extends Animals {

    private int maxRun = 200;
    private static int colCats = 0;

    public Cat(String name) {
        super(name);
        colCats++;
    }

    public void run(int distance) {
        if (distance <= maxRun)
            System.out.println("Кошка " + getName() + " пробежал(а) " + distance + " м.");
        else
            System.out.println("Кошка " + getName() + "не может пробежать " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println("Кошка " + getName() + " не может проплыть " + distance + " м, потому что кошки не умеют плавать");
    }

    public static int getColCats() {
        return colCats;
    }

}

package hillel.suraieva;

public class Main {
    public static void main(String[] args) {


        Dog dogBobik = new Dog("Бобик");
        Dog dogSharik = new Dog("Шарик");
        Dog dogAila = new Dog("Айла");
        Dog dogRex = new Dog("Рэкс");
        Cat catMyrka = new Cat("Мурка");
        Cat catPyrka = new Cat("Пурка");
        Cat catLyrka = new Cat("Лурка");

        dogBobik.run(226151);
        dogAila.run(499);
        catPyrka.run(50);
        catMyrka.swim(40);


        System.out.println("Было создано животных: " + Animals.getColAnimals());
        System.out.println("Было создано собак: " + Dog.getColDogs());
        System.out.println("Было создано котов: " + Cat.getColCats());


    }
}

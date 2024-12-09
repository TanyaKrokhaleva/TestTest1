package lesson10.Animals;

public class Animal {

    public static int animalCount;

    public String getName() {
        return name;
    }

    private String name;

    public void run (int distance) {
        System.out.println(distance);
    }

    public void swim (int distance) {
        System.out.println(distance);
    }
    public Animal(String name) {
        this.name = name;
        animalCount++;


    }
}

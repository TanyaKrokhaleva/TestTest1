package lesson10;

public class Cat extends Animal {
    public static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Котики не могут бежать больше 200 метров");

        } else
            System.out.println(getName() + " пробежал " + distance + " метров");

    }

    public void swim(int distance) {
        System.out.println("Котики не умеют плавать");
    }

}



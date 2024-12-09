package lesson10.Animals;

public class Dog extends Animal {
    public static int dogCount;
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собаки не могут бежать больше 500 метров");
        } else
            System.out.println(getName() + " пробежал " + distance + " метров");
        }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собаки не могут плыть более 10 метров");
        } else
            System.out.println(getName() + " проплыл " + distance + " метров");
    }

}


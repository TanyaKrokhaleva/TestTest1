package lesson10.Animals;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Рыжик");
        cat1.run(100);
        cat1.swim(300);
        Cat cat2 = new Cat("Черныш");
        cat2.run(150);
        cat2.swim(300);
        Cat cat3 = new Cat("Беляш");
        cat3.run(90);
        cat3.swim(80);
        Cat cat4 = new Cat("Компот");
        cat4.run(400);
        cat4.swim(30);
        System.out.println("Всего котов: " + Cat.catCount);

        Dog dog1 = new Dog("Шарик");
        dog1.run(435);
        dog1.swim(11);
        Dog dog2 = new Dog("Кубик");
        dog2.run(500);
        dog2.swim(5);
        System.out.println("Всего собак: " + Dog.dogCount);

        System.out.println("Всего животных: " + Animal.animalCount);

        Cat.fullBowl(25);
        Cat[] cats = new Cat[4];
        cats[0] = cat1;
        cats[1] = cat2;
        cats[2] = cat3;
        cats[3] = cat4;

        for (Cat cat : cats) {
            cat.catEat(10);
        }

    }

}

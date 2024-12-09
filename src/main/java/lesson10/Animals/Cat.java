package lesson10.Animals;

public class Cat extends Animal {
    public static int bowlFood;
    private boolean satiety = false;
    public static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Котик не может бежать больше 200 метров");

        } else
            System.out.println(getName() + " пробежал " + distance + " метров");

    }

    @Override
    public void swim(int distance) {
        System.out.println("Котик не умеет плавать");
    }

    public static void fullBowl(int foodAmount) {
        if (foodAmount > 0) {
            bowlFood += foodAmount;
            System.out.println("Добавлено " + foodAmount + " еды в миску. Теперь в миске: "
                    + bowlFood);
        } else System.out.println("Нельзя добавить отрицательное количество корма");
    }

    public void catEat(int foodAmountEat) {
        if (foodAmountEat > bowlFood) {
            setSatiety(false);
            System.out.println("В миске не хватает еды, котик не может покушать. Котик " + getSatietyStatus());
        } else {
            bowlFood -= foodAmountEat;
            setSatiety(true);
            System.out.println("Котик покушал " + foodAmountEat + " еды. " + "Осталось в миске: " + bowlFood + ". Котик " + getSatietyStatus());
        }

    }
    private String getSatietyStatus() {
        if (isSatiety()) {
            return "сыт.";
        }
        else return "голоден.";
    }

}









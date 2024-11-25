package lesson4;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(five(5, 64));
        number(-9);
        System.out.println(fived(10));
        str("Строка", 5);
        System.out.println(getLeapYear(2134));
        replaceNumbers();
    }

    /**
     * Задание №1
     **/
    public static void printThreeWords() {
        System.out.println("Задание №1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * Задание №2
     **/
    public static void checkSumSign() {
        System.out.println("\nЗадание №2");
        int a = 7;
        int b = -9;
        int sum = a + b;
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    /**
     * Задание №3
     **/
    public static void printColor() {
        System.out.println("\nЗадание №3");
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * Задание №4
     **/
    public static void compareNumbers() {
        System.out.println("\nЗадание №4");
        int a = 30;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /**
     * Задание №5
     **/
    public static boolean five(int a, int b) {
        System.out.println("\nЗадание №5");
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }

    /**
     * Задание №6
     **/
    public static void number(int number) {
        System.out.println("\nЗадание №6");
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }


    /**
     * Задание №7
     **/
    public static boolean fived(int number) {
        System.out.println("\nЗадание №7");
        if (number < 0) {
            return true;
        } else {
            return false;

        }
    }

    /**
     * Задание №8
     **/
    public static void str(String a, int num) {
        System.out.println("\nЗадание №8");

        for (int i = 0; i < num; i++) {
            System.out.println(a);
        }
    }

    /**
     * Задание №9
     **/
    public static boolean getLeapYear(int year) {
        System.out.println("\nЗадание №9");
        if (year < 1) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else return false;
    }

    /**
     * Задание №10
     **/
    public static void replaceNumbers() {
        System.out.println("\nЗадание №10");
        byte[] array = new byte[]{1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        System.out.print("Исходные числа:");
        for (byte i : array) {
            System.out.print(" " + i);
        }
        System.out.print("\nНовые числа:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }
        for (byte i : array) {
            System.out.print(" " + i);
        }

    }
}



























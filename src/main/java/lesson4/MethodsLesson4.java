package lesson4;

public class MethodsLesson4 {
    /**
     * Задание №1
     **/
    public void printThreeWords() {
        System.out.println("Задание №1");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * Задание №2
     **/
    public void checkSumSign() {
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
    public void printColor() {
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
    public void compareNumbers() {
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
    public boolean isSumInRange(int a, int b) {
        System.out.println("\nЗадание №5");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Задание №6
     **/
    public void checkNumber(int number) {
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
    public boolean isNegative(int number) {
        System.out.println("\nЗадание №7");
        return number < 0;
    }

    /**
     * Задание №8
     **/
    public void printStringMultipleTimes(String a, int num) {
        System.out.println("\nЗадание №8");

        for (int i = 0; i < num; i++) {
            System.out.println(a);
        }
    }

    /**
     * Задание №9
     **/
    public boolean getLeapYear(int year) {
        System.out.println("\nЗадание №9");
        if (year < 1) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else return year % 4 == 0;
    }

    /**
     * Задание №10
     **/
    public void replaceNumbers() {
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

    /**
     * Задание №11
     **/
    public void setArray() {
        System.out.println("\n\nЗадание №11");
        int[] array = new int[100];
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
            number++;
        }
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    /**
     * Задание №12
     **/
    public void setArray2() {
        System.out.println("\n\nЗадание №12");
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходные числа:");
        for (int i : array) {
            System.out.print(" " + i);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                int temp;
                temp = array[i] * 2;
                array[i] = temp;
            }
        }
        System.out.println();
        System.out.print("Новые числа:");
        for (int i : array) {
            System.out.print(" " + i);
        }
    }

    /**
     * Задание №13
     **/
    public void squareArray() {
        System.out.println("\n\nЗадание №13");
        int[][] array = new int[11][11];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            array[i][array.length - 1 - i] = 1;
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    /**
     * Задание №14
     **/
    public void changedArray(int len, String initialValue) {
        System.out.println("\nЗадание №14");
        String[] array = new String[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}

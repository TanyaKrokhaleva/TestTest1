package Lesson7;

import static Lesson7.Factorial.factorial;

public class Main {
    public static void main(String[] args) {
        int number = 7;
        long fact = factorial(number);
        System.out.println("Факториал " + number + " равен " + fact);

    }
}


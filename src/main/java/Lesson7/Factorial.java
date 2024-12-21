package Lesson7;

public class Factorial {
        public static long factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

}
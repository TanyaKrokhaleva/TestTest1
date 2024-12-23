package Lesson7;

public class Factorial {
        public static long factorial(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Факториал отрицательного числа не определен.");
            }
            else if (n > 20) {
                throw new IllegalArgumentException("Факториал числа больше 20 не поддерживается для вычисления данной программой");
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

}

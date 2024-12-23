import Lesson7.Factorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;


public class TestJunit5 {

    @ParameterizedTest
    @DisplayName("Проверка нуля")
    @ValueSource(ints = {0})
    void testFactorialOfZero(int input) {
        assertEquals(1, Factorial.factorial(input));
    }

    @ParameterizedTest
    @DisplayName("Проверка положительных значений")
    @CsvSource({
            "1, 1",
            "20, 2432902008176640000"
    })
    void testFactorialOfPositiveNumbers(int input, long expectedInt) {
        assertEquals(expectedInt, Factorial.factorial(input));
    }
    @ParameterizedTest
    @DisplayName("Проверка отрицательных значений")
    @ValueSource(ints = {-1, -10})
    void testFactorialOfNegativeNumber(int input) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(input));
        assertEquals("Факториал отрицательного числа не определен.", exception.getMessage());
    }
    @ParameterizedTest
    @DisplayName("Проверка факториала с исходным числом больше допустимого")
    @ValueSource(ints = {21})
    void testFactorialTooBig(int input) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(input));
        assertEquals("Факториал числа больше 20 не поддерживается для вычисления данной программой", exception.getMessage());
    }

}
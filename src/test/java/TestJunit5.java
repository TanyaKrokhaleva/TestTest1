import Lesson7.Factorial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestJunit5 {

    @ParameterizedTest
    @DisplayName("Проверка нуля")
    @ValueSource(ints = {0})
    void testFactorialOfZero(int input) {
        assertEquals(1, Factorial.factorial(input));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5)); // 5! = 120
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertEquals("Факториал отрицательного числа не определен.", exception.getMessage());

    }
}
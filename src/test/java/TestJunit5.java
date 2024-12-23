import Lesson7.Factorial;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestJunit5 {

    @Test
    void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0));
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
package Lesson7tests;

import Lesson7.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test

    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.factorial(0), 1);
    }
    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(Factorial.factorial(5), 120); // 5! = 120
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(Factorial.factorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Факториал отрицательного числа не определен.")
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-1);
    }
}








package Lesson7tests;

import Lesson7.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test(dataProvider = "zeroDataProvider", dataProviderClass = DataProviders.class, description = "Проверка нуля")
    public void testFactorialOfZero(int input) {
        assertEquals(1, Factorial.factorial(input));
    }

    @Test(dataProvider = "positiveNumbersDataProvider", dataProviderClass = DataProviders.class, description = "Проверка положительных значений")
    public void testFactorialOfPositiveNumbers(int input, long expected) {
        assertEquals(expected, Factorial.factorial(input));
    }

    @Test(dataProvider = "negativeNumbersDataProvider", dataProviderClass = DataProviders.class, description = "Проверка отрицательных значений", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber(int input) {
        Factorial.factorial(input);
    }

    @Test(dataProvider = "tooBigNumberDataProvider", dataProviderClass = DataProviders.class, description = "Проверка факториала с исходным числом больше допустимого", expectedExceptions = IllegalArgumentException.class)
    public void testFactorialTooBig(int input) {
        Factorial.factorial(input);
    }
}











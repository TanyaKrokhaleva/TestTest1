package Lesson7tests;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "zeroDataProvider")
    public static Object[][] zeroDataProvider() {
        return new Object[][]{{0}};
    }

    @DataProvider(name = "positiveNumbersDataProvider")
    public static Object[][] positiveNumbersDataProvider() {
        return new Object[][]{
                {1, 1},
                {20, 2432902008176640000L}
        };
    }

    @DataProvider(name = "negativeNumbersDataProvider")
    public static Object[][] negativeNumbersDataProvider() {
        return new Object[][]{{-1}, {-10}};
    }

    @DataProvider(name = "tooBigNumberDataProvider")
    public static Object[][] tooBigNumberDataProvider() {
        return new Object[][]{{21}};
    }
}

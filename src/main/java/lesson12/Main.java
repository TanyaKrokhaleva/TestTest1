package lesson12;


public class Main {

    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "20", "40", "50"},
                {"A", "6", "7", "8"},
                {"44", "25", "26", "33"},
                {"11", "17", "77", "3"}};
        System.out.println("Сумма всех ячеек: " + MyArraySumCalculator.calculateSum(matrix));
        String[][] matrix1 = {
                {"1", "20", "40", "50"},
                {"6", "6", "7", "8"}};
        System.out.println("Сумма всех ячеек: " + MyArraySumCalculator.calculateSum(matrix1));
    }





    }






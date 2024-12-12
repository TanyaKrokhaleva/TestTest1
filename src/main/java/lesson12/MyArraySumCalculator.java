package lesson12;

import lesson12.Exception.MyArrayDataException;
import lesson12.Exception.MyArraySizeException;

public class MyArraySumCalculator {

    public static int calculateSum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException("Размер массива должен быть 4*4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    String a = "Неверные данные в ячейке" + " [" + i + "][" + j + "]: " + array[i][j];
                    System.err.println(new MyArrayDataException(a).getMessage());

                }
            }
        }
            return sum;

        }

    }


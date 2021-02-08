package ru.geekbrains.java2.lesson2;

public class ArraySum {

    public void calcArray(String[][] array) {

        checkArraySize(array);

        for (int i = 0; i < array.length; i++) {
            checkArraySize(array[i]);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exc) {
                    throw new NumberInputException(
                            String.format("Значение массива [%s, %s] = %s не является числом", (i+1), (j+1), array[i][j]),
                            exc
                    );
                }
            }
        }
        System.out.println("Сумма всех элементов = " + sum);
    }

    public void checkArraySize(String[] array) {
        if (array.length != 4) {
            throw new LengthArrayException("Задан массив больше чем 4х4!");
        }
    }
    public void checkArraySize(String[][] array) {
        if (array.length != 4) {
            throw new LengthArrayException("Задан массив больше чем 4х4!");
        }
    }
}


package ru.geekbrains;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int line, int column) {
        super(String.format( " ОШИБКА!!! Значение в строке %d , столбце %d  не является числом!!!", line, column));
    }
}

package ru.geekbrains;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException() {
        super("ОШИБКА!!! Поле массива должно составлять 4х4!!!");
    }
}

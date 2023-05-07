package org.example;

public class MyDataException extends MyException{

    /**
     * Метод выбрасывает исключение, если данные не соответствуют формату
     * @param message сообщение о выведеннмо исключении
     * @param x номер введенного данного в строке
     */
    public MyDataException(String message, int x) {
        super(message, x);
    }

}

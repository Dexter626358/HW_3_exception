package org.example;

abstract class MyException extends Exception {
    private final int x;

    public MyException(String message, int x) {
        super(message);
        this.x = x;
    }

    public int getX() {
        return x;
    }
}

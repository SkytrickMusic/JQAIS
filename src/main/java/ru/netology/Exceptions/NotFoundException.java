package ru.netology.Exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}
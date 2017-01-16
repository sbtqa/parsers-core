package ru.sbtqa.tag.parsers.core.exceptions;

public class ParserException extends Exception {

    public ParserException(String message) {
        super(message);
    }

    public ParserException(String string, Throwable ex) {
        super(string, ex);
    }
}

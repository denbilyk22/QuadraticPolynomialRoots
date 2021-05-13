package com.sqrt.exception;

public class NoRootsException extends RuntimeException{
    public NoRootsException() {
    }

    public NoRootsException(String message) {
        super(message);
    }

    public NoRootsException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoRootsException(Throwable cause) {
        super(cause);
    }
}

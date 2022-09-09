package com.arthur.workshop.services.exception;

import java.io.Serial;

public class ObjectNotFoundException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1l;

    public ObjectNotFoundException(String message) {
        super(message);
    }
}

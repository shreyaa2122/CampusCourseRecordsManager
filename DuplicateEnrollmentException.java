package edu.ccrm.exception;

import java.io.Serializable;

public class DuplicateEnrollmentException extends Exception implements Serializable {
    
    // This is the serialVersionUID that is causing the error.
    private static final long serialVersionUID = 1L;

    public DuplicateEnrollmentException(String message) {
        super(message);
    }
}
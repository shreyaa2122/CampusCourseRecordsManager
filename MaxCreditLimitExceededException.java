package edu.ccrm.exception;

import java.io.Serializable;

public class MaxCreditLimitExceededException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public MaxCreditLimitExceededException(String message) {
        super(message);
    }
}

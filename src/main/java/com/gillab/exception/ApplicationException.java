package com.gillab.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor @ToString @Getter
public class ApplicationException extends RuntimeException {

    private UUID correlationId;
    private String errorCode;
    private String errorSummary;
    private String errorMessage;

    public String getMessage() {
        return errorMessage;
    }

}

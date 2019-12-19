package de.exceptionex3.exceptions;

public class ApplicationException extends Exception {

    public ApplicationException(String msg, Throwable cause){
        super(msg, cause);
    }
}

package com.tiv.easy.spring.beans;

/**
 * Base exception class for Spring beans related exceptions
 */
public class BeansException extends RuntimeException {

    /**
     * Construct a new BeansException with the specified detail message
     *
     * @param msg the detail message
     */
    public BeansException(String msg) {
        super(msg);
    }

    /**
     * Construct a new BeansException with the specified detail message and cause
     *
     * @param msg   the detail message
     * @param cause the cause of this exception
     */
    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}

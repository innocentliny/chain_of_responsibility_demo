package com.example.cor.domain;

/**
 * The handler interface
 * @param <T> generic type of the data
 */
public interface Handler<T> {
    /**
     * Handle the data
     * @param data the data
     */
    void handle(T data);

    /**
     * @return the name of the handler
     */
    String getName();
}

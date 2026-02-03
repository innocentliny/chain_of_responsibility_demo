package com.example.cor.handler;

/**
 * Element of a chain
 * @param <T> generic type of the element
 */
public interface ChainElement<T> {
    /**
     * Set the next element in the chain
     * @param next the next element
     */
    void setNext(T next);
}

package com.example.cor.domain;

/**
 * Abstract base class for elements in a chain of responsibility pattern, specifically for handling requests.
 * Implements the {@link RequestHandlerChainElement} interface. <br>
 *
 * This class provides a mechanism to set the next element in the chain and to propagate a given request
 * through the chain, starting with the current handler. Subclasses are required to implement the
 * {@code doHandle(Request req)} method to define their specific handling logic.
 */
public abstract class AbstractRequestHandlerChainElement implements RequestHandlerChainElement {
    private RequestHandlerChainElement next;

    @Override
    public void setNext(RequestHandlerChainElement next) {
        this.next = next;
    }

    @Override
    public void handle(Request req) {
        try {
            doHandle(req);
            System.out.println(this.getName() + " handled " + req.data());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (next != null) {
                next.handle(req);
            }
        }
    }

    public abstract void doHandle(Request req);
}

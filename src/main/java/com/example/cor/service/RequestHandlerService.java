package com.example.cor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.cor.domain.Request;
import com.example.cor.handler.RequestHandlerChainElement;

import java.util.List;

/**
 * The service to handle request.
 */
@Component
public class RequestHandlerService {
    RequestHandlerChainElement firstElement;

    @Autowired
    public RequestHandlerService(List<RequestHandlerChainElement> handlers) {
        if (handlers == null || handlers.isEmpty()) {
            throw new IllegalArgumentException("handlers cannot be null or empty");
        }

        firstElement = handlers.getFirst();

        // build chain
        for (int i = 0; i < handlers.size(); i++) {
            int nextIdx = i + 1;
            handlers.get(i).setNext(nextIdx < handlers.size() ? handlers.get(nextIdx) : null);
        }
    }

    /**
     * start to handle request
     * @param req the request
     */
    public void handle(Request req) {
        firstElement.handle(req);
    }
}
